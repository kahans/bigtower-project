package com.team4.project.hospital.receiveReservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.project.hospital.dto.HoPatient;

@Controller
public class HoReceiveReservationController {
	private static final Logger logger = LoggerFactory.getLogger(HoReceiveReservationController.class);
	@Autowired
	private HoReceiveReservationService hoRRService;
	
	//접수폼 보여주기
	@RequestMapping(value="/hospital/receive", method=RequestMethod.GET)
	public String addReceive(){
		logger.debug("addPatient GET");
	
		return "/hospital_YJ/receive";
	}
	
	//접수실행
	@RequestMapping(value="/hospital/receive", method=RequestMethod.POST)
	public String addReceive(HoPatient hoPatient){
		logger.debug("addReceive POST");
		logger.debug("hoReceive:"+hoPatient);
		
		return "/hospital_YJ/receive";
	}
	
	//ajax 한명의 환자정보 조회
	@RequestMapping(value="hospital/searchPatient", method=RequestMethod.POST)
	public @ResponseBody HoPatient selectPatient1(@RequestParam("goCitizenId")String goCitizenId){
		logger.debug("selectPatient1 POST");
		HoPatient hopatient = hoRRService.searchPatient(goCitizenId);
		logger.debug("hopatient:"+hopatient);
		
		return hopatient;
	}
}


