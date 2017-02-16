package com.team4.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController_hospital_chart {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController_hospital_chart.class);
	
	@RequestMapping(value="/hospital/chart", method=RequestMethod.GET)
	public String chart(){
		logger.debug("chart");
		return "/hospital/charts";
	}
}
