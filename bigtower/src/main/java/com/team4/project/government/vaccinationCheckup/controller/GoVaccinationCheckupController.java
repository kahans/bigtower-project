package com.team4.project.government.vaccinationCheckup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoVaccinationCheckupController {

	@Autowired
	private GoVaccinationCheckupService goVCS;
	
	@RequestMapping(value="/government/vaccination", method=RequestMethod.GET)
	public String vaccinationList(Model model){
		model.addAttribute("vaccinationList", goVCS.vaccinationList());
		return "/government_si/goVaccinationList";
	}
}
