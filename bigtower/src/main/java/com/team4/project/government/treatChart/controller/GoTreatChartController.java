package com.team4.project.government.treatChart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.HomeController;

@Controller
public class GoTreatChartController {
	private static final Logger logger = LoggerFactory.getLogger(GoTreatChartController.class);
	
	@Autowired
	private GoTreatChartService goTCS;


	
}
