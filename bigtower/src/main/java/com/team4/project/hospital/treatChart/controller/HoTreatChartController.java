package com.team4.project.hospital.treatChart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HoTreatChartController {

	@Autowired
	private HoTreatChartService hoTCS;
	
	//차트 등록(뷰페이지 없음)
	@RequestMapping(value="/hospital/addChart", method=RequestMethod.GET)
	public String addChart(){
		
		return "redirect:/hospital/receive";
	}
	
}
