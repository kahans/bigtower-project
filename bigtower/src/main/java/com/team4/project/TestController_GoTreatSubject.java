package com.team4.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController_GoTreatSubject {
	
	@Autowired
	private TestService testservice;
	@RequestMapping(value="/treatSubject", method=RequestMethod.GET)
	public String selectTreatSubject(Model model){
		List list = testservice.selectTreatSubject();
		model.addAttribute("list", list);
	
		return "/treatSubject";
		
	}
}
