package com.team4.project.hospital.treatChart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.project.hospital.dto.HoDisease;
import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;

@Controller
public class HoTreatChartController {

	@Autowired
	private HoTreatChartService hoTCS;
	
	//차트 등록(뷰페이지 없음)
	@RequestMapping(value="/hospital/addChart", method=RequestMethod.GET)
	public String addChart(RedirectAttributes redidredctAttributes, 
						   HttpSession session,HoChart hoChart,
						   @RequestParam(value="hoCitizenId")String hoCitizenId
						   ){
		System.out.println("===================차트등록====================");
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE"); //세션에서 병원코드 겟팅
		hoChart.setHoHospitalCode(hoHospitalCode);
		System.out.println("hoChart : "+hoChart );
		hoTCS.addChart(hoChart);
		System.out.println("===================차트가 생성되었습니다====================");
		
		//receive폼에 보낼 환자 주민번호
		redidredctAttributes.addAttribute("hoCitizenId", hoCitizenId);
		return "redirect:/hospital/receive";
	}
	
	//진료 페이지
	@RequestMapping(value="/hospital/treatView", method=RequestMethod.GET)
	public String treatView(Model model,
			@RequestParam(value="hoTreatmentCode")String hoTreatmentCode){
		//검사 이름 가져오기, 질병이름 가져오기
		List<HoTest> testList = hoTCS.selectTest();
		List<HoDisease> diseaseList = hoTCS.selectDisease();
		
		model.addAttribute("hoTreat",hoTCS.treatView(hoTreatmentCode));
		model.addAttribute("testList", testList);
		model.addAttribute("diseaseList", diseaseList);
		return "/hospital/views/treatView";
	}
	
	//진료목록
	@RequestMapping(value="/hospital/treatList", method=RequestMethod.GET)
	public String treatmentList(HoTreatSub hp, HttpSession session, Model model){
		
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoTreatSub> treatList  = hoTCS.treatList(hospitalCode);
		System.out.println(treatList.toString());
		model.addAttribute("treatList", treatList);
		return "/hospital/views/treatmentList";
	}
	
	//접수 목록에서 접수완료를 클릭시 진료 데이터 생성
	@RequestMapping(value="/hospital/addTreat")
	public String addTreat(String hoPatientCode,
						   String hoTreatSubjectCode,
						   HoTreat hoTreat,
						   HttpSession session){
		
		System.out.println("hoPatientCode : "+hoPatientCode);
		System.out.println("hoTreatSubjectCode : "+hoTreatSubjectCode);
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hoHospitalCode",hoHospitalCode);
		map.put("hoPatientCode",hoPatientCode);
		String hoChartCode = hoTCS.selectChartCode(map);
		System.out.println("hoChartCode : "+hoChartCode);
		
		
		System.out.println("hoTreat 셋팅하기전 : "+hoTreat);
		hoTreat.setHoPatientCode(hoPatientCode);
		hoTreat.setHoChartCode(hoChartCode);
		hoTreat.setHoHospitalCode(hoHospitalCode);
		hoTreat.setHoTreatSubjectCode(hoTreatSubjectCode);
		System.out.println("hoTreat 셋팅후 : "+hoTreat);
		int result = hoTCS.addTreat(hoTreat);
		System.out.println("addTreat 결과는 ?"+ result);
		return "redirect:/hospital/treatList";
	}
	
}
