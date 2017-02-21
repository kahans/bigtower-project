package com.team4.project.government.hopitalizationSurgery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoHospitalizationSurgeryController {

	@Autowired
	private GoHospitalizationSurgeryService goHSS;
	//수술목록
	@RequestMapping(value="/government/surgeryList", method=RequestMethod.GET)
	public String surgeryList(Model model){
		
		model.addAttribute("goSurgery", goHSS.goSurgeryList());
		return "/government/citizen/hospitalizationSurgery/surgeryList";
	}
	//입,퇴원 목록
	@RequestMapping(value="/government/hospitalizationList", method=RequestMethod.GET)
	public String hospitalizationList(Model model){
		System.out.println("컨트롤러 : "+goHSS.goHospitalizationList());
		model.addAttribute("goHospitalization",goHSS.goHospitalizationList());
		return "/government/citizen/hospitalizationSurgery/hospitalizationList";
	}
}
