package com.team4.project.hospital.vaccineCheckup.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.project.hospital.test.domain.HoTestRequestSub;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckupSub;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

@Controller
public class HoVaccineCheckupController {

	@Autowired
	private HoVaccineCheckupService hoVCS;
	
	//건강검진 리스트
	@RequestMapping(value="/hospital/test/listCheckup", method=RequestMethod.GET)
	public String checkupList(HoTestRequestSub hoTestRequestSub, Model model,
			HttpSession session){
		String hoHospitalCode = (String)session.getAttribute("HOSPITALCODE");
		hoTestRequestSub.setHoTestCode("3");
		hoTestRequestSub.setHoTestStateCode(1);
		hoTestRequestSub.setHoHospitalCode(hoHospitalCode);
		List<HoTestRequestSub> checkupList = hoVCS.checkupList(hoTestRequestSub);
		
		model.addAttribute("checkupList", checkupList);
		return "/hospital/views/tests/listCheckup";
	}
	//건강검진 상태 업데이트 검사대기로 변경 검사 대기
	@RequestMapping(value="/hospital/test/updateCheckupState", method=RequestMethod.GET)
	public String updateCheckupState(HoTestRequestSub hoTestRequest, HttpSession session,
			@RequestParam(value="hoTestRequestCode", required=false)String hoTestRequestCode
			){
		String hoHospitalCode=(String) session.getAttribute("HOSPITALCODE");
		hoTestRequest.setHoHospitalCode(hoHospitalCode);
		hoTestRequest.setHoTestRequestCode(hoTestRequestCode);
		hoTestRequest.setHoTestCode("3");
		hoVCS.updateCheckupState(hoTestRequest);
		return "redirect/hospital/test/listCheckupWait";
	}
	//결과 대기 상태목록을 출력
	@RequestMapping(value="/hospital/test/listCheckupWait",method=RequestMethod.GET)
	public String listCheckupWait(Model model, HoTestRequestSub hoTestRequestSub,
			HttpSession session){
		String hoHospitalCode = (String)session.getAttribute("HOSPITALCODE");
		hoTestRequestSub.setHoTestCode("3");
		hoTestRequestSub.setHoHospitalCode(hoHospitalCode);
		hoTestRequestSub.setHoTestStateCode(2);
		
		List<HoTestRequestSub> checkupList=hoVCS.checkupList(hoTestRequestSub);
		
		model.addAttribute("checkupList", checkupList);
		return "/hospital/views/tests/listCheckupWait";
	}
	//건강검진 등록 뷰 get
	@RequestMapping(value="/hospital/test/addCheckup", method=RequestMethod.GET)
	public String checkupAdd(Model model, HttpSession session,
				@RequestParam(value="hoTestRequestCode", required=false)String hoTestRequestCode
			){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		HoCheckupSub checkView = hoVCS.checkView(hoTestRequestCode);
		checkView.setHoHospitalCode(hoHospitalCode);
		hoVCS.updateCheckupTestRequest(checkView);
		
		hoVCS.addCheck(checkView);
		model.addAttribute("checkView", checkView);
		return "/hospital/views/tests/addCheckup";
	}
	
	//건강검진 등록 뷰 post
	@RequestMapping(value="/hospital/test/addCheckup", method=RequestMethod.POST)
	public String checkAdd(HttpServletRequest request, HoCheckupSub addCheckup,
			HttpSession session
	){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		addCheckup.setHoHospitalCode(hoHospitalCode);
		String path="D:\\testImage";//상대주소
		// 배포시사용할경로
		//String path = "/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/image";
		addCheckup.setHoCheckUpResultPath(path);
		hoVCS.updateCheck(addCheckup);
		return "redirect:/hospital/test/listCheckupWait";
	}
	
	//예방접종 등록
	@RequestMapping(value="/hospital/addVaccine")
	public String addVaccine(HoVaccine hoVaccine){
		int result = hoVCS.addVaccine(hoVaccine);
		System.out.println("예방접종 등록 결과는 ? "+result);
		return "redirect:/hospital/treatList";
	}
}
