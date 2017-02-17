package com.team4.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController_si {

	@Autowired
	private TestService_si testService;
	
	@RequestMapping(value="/treat/treatList", method=RequestMethod.GET)
	public String treatList(Model model){
		System.out.println(testService.goTreatList());
		model.addAttribute("goTreatList", testService.goTreatList());
		return "/test_si";
	}
}
