package com.team4.project.hospital.treatChart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.project.hospital.treatChart.domain.HoChart;

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
	public String treatView(@RequestParam(value="hoPatientCode")String hoPatientCode){
		return "/hospital/views/treatView";
	}
	
}
