package com.team4.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.government.treat.controller.GoTreatService;

@Controller
public class TestController_government_citizen {
	
	@Autowired
	private GoTreatService goTCS;
	
	@RequestMapping(value = "/citizen/main", method = RequestMethod.GET)
	public String home() {
		
		return "government/citizen/cmain";
	}
	/*진료내역 경로*/
	/*@RequestMapping(value = "/citizen/searchtreat", method = RequestMethod.GET)
	public String treat(Model model) {
		model.addAttribute("Treat",goTCS.goSelectTreat());
		return "government/citizen/searchTreat";
	}*/
	/* 진료내역 글보기 모달에 보낼 데이터 */
	/*@RequestMapping(value="/government/treatView", method=RequestMethod.GET)
	public String goSelectTreat(Model model){
		model.addAttribute("Treat",goTCS.goSelectTreat());
		return "/government_si/goSelectTreat";
	}*/
	
	/*@RequestMapping(value = "/citizen/searchVaccine", method = RequestMethod.GET)
	public String searchVaccine(Model model) {
		model.addAttribute("Treat",goTCS.goSelectTreat());
		return "government/citizen/searchVaccine";
	}*/
}
