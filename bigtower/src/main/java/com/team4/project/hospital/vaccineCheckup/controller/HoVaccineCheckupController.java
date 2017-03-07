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
	public String checkupList(HoTestRequestSub hoTestRequestSub, Model model){
		hoTestRequestSub.setHoTestCode("3");
		List<HoTestRequestSub> checkupList = hoVCS.checkupList(hoTestRequestSub);
		
		model.addAttribute("checkupList", checkupList);
		return "/hospital/views/tests/listCheckup";
	}
	
	//건강검진 등록 뷰 get
	@RequestMapping(value="/hospital/test/addCheckup", method=RequestMethod.GET)
	public String checkupAdd(Model model,
				@RequestParam(value="hoTestRequestCode", required=false)String hoTestRequestCode
			){
		HoCheckupSub checkView = hoVCS.checkView(hoTestRequestCode);
		hoVCS.addCheck(checkView);
		model.addAttribute("checkView", checkView);
		return "/hospital/views/tests/addCheckup";
	}
	
	//건강검진 등록 뷰 post
	@RequestMapping(value="/hospital/test/addCheckup", method=RequestMethod.POST)
	public String checkAdd(HttpServletRequest request, HoCheckupSub addCheckup,
			HttpSession session
	){
		String path="D:\\testImage";//상대주소
		// 배포시사용할경로
		//String path = "/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/image";
		addCheckup.setHoCheckUpResultPath(path);
		hoVCS.updateCheck(addCheckup);
		return "redirect:/hospital/test/listCheckup";
	}
	
	//예방접종 등록
	@RequestMapping(value="/hospital/addVaccine")
	public String addVaccine(HoVaccine hoVaccine){
		int result = hoVCS.addVaccine(hoVaccine);
		System.out.println("예방접종 등록 결과는 ? "+result);
		return "redirect:/hospital/treatList";
	}
}
