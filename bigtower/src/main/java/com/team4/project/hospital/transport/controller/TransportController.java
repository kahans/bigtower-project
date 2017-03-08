package com.team4.project.hospital.transport.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransportController {
	private static final Logger logger = LoggerFactory.getLogger(TransportController.class);
	@Autowired
	private TransportService transportService;
	
	
	@RequestMapping(value="/hospital/getAll", method=RequestMethod.GET)
	public void getAll(HttpSession session){
		logger.debug("getAll controller 진입");
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");
		transportService.getAll(hospitalCode);
		
		logger.debug("getAll controller 끝");

	}
}
