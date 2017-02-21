package com.team4.project.government.vaccinationCheckup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;

@Controller
public class GoVaccinationCheckupController {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupController.class);
	@Autowired
	private GoVaccinationCheckupService goVCS;
	
	@RequestMapping(value="/government/vaccination", method=RequestMethod.GET)
	public String vaccinationList(Model model){
		model.addAttribute("vaccinationList", goVCS.vaccinationList());
		return "/government_si/goVaccinationList";
	}
	
	@RequestMapping(value="/governmentYJ/checkUp" , method=RequestMethod.GET)
	public String checkUpList(){
		
		
		return "/governmentYJ/checkUp";
		
	
	}
	@RequestMapping(value="/governmentYJ/checkUp", method=RequestMethod.POST)
	public String checkUpList(GoCheckup gocheckup, Model model){
		
		
		List<GoCheckup> checkUp = goVCS.checkUpList(gocheckup);
		
		
		for(GoCheckup x:checkUp){
			logger.debug(" : "+x.toString());
		}
		
		model.addAttribute("checkUp", checkUp);
		
		
		
		return "/governmentYJ/checkUpResult";
		
	}
}