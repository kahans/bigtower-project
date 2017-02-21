package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgery;

@Controller
public class GoHospitalizationSurgeryController {

	@Autowired
	private GoHospitalizationSurgeryService goHSS;
	//수술 뷰를 가져오기
	@RequestMapping(value="/government/surgeryList", method=RequestMethod.GET)
	public String surgeryList(Model model, @RequestParam HashMap<String, String> map){
		String seachFirstDay = map.get("firstDay");
		
		model.addAttribute("goSurgery", goHSS.goSurgeryList());
		return "/government/citizen/hospitalizationSurgery/surgeryList";
	}
	//수술목록 불러오기
	@RequestMapping(value="/government/surgeryList", method=RequestMethod.POST)
	public String surgeryList(Model model, GoSurgery goSurgery){
		
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
	
	@RequestMapping(value="/government/hospitalizationList", method=RequestMethod.POST)
	public String hospitalizationList(Model model, GoHospitalization goHospitalization){
		System.out.println("컨트롤러 : "+goHSS.goHospitalizationList());
		model.addAttribute("goHospitalization",goHSS.goHospitalizationList());
		return "/government/citizen/hospitalizationSurgery/hospitalizationList";
	}
}
