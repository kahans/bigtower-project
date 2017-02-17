package com.team4.project.government.treatChart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoTreatChartController {

	@Autowired
	private GoTreatChartService goTCS;
	
	@RequestMapping(value="/government/treatView", method=RequestMethod.GET)
	public String goSelectTreat(Model model){
		model.addAttribute("Treat",goTCS.goSelectTreat());
		return "/government_si/goSelectTreat";
	}
}
