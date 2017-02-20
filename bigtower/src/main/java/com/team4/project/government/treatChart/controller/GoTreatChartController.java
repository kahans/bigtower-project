package com.team4.project.government.treatChart.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.project.government.treatChart.domain.GoTreat;

@Controller
public class GoTreatChartController {
	private static final Logger logger = LoggerFactory.getLogger(GoTreatChartController.class);
	
	@Autowired
	private GoTreatChartService goTCS;

	//진료 상세보기
	@RequestMapping(value="/government/treatView", method=RequestMethod.GET)
	public String goSelectTreat(Model model,
			@RequestParam(value="goTreatCode")String goTreatCode){
		System.out.println("진료상세보기 진료코드 : "+goTreatCode);
		model.addAttribute("Treat",goTCS.goSelectTreat(goTreatCode));
		return "/government_si/goSelectTreat";
	}
	
	//진료목록 
	@RequestMapping(value="/government/treatList", method=RequestMethod.GET)
	public String treatList(Model model){
		System.out.println("treatList : "+goTCS.goTreatList());
		//리스트를 출력한다. ( 진료목록, 질병목록은 서비스.java에서 실행이 된다....)
		model.addAttribute("goTreatList", goTCS.goTreatList());
		return "/government_si/goTreatList";
	}
	
	//진료목록 검색
	@RequestMapping(value="/government/treatSearch", method=RequestMethod.POST)
	public String treatSearchList(){
		return "redirect:/";
	}
	
	
	
}
