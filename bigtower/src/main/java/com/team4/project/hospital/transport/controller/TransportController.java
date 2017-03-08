package com.team4.project.hospital.transport.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Component
public class TransportController {
	private static final Logger logger = LoggerFactory.getLogger(TransportController.class);
	@Autowired
	private TransportService transportService;
	
	//@Scheduled(cron = "*/10 * * * * *") // 10초 간격 실행
	@RequestMapping(value="/hospital/send1", method=RequestMethod.GET)
	public void send1(){
		logger.debug("getAll controller 진입");
		String hospitalCode = "hospital_1";
		transportService.getAll(hospitalCode);
		logger.debug("getAll controller 끝");
	}
	
	//@Scheduled(cron = "*/10 * * * * *") // 10초 간격 실행
	@RequestMapping(value="/hospital/send2", method=RequestMethod.GET)
	public void send2(){
		logger.debug("getAll controller 진입");
		String hospitalCode = "hospital_2";
		transportService.getAll(hospitalCode);
		logger.debug("getAll controller 끝");
	}
	
	//@Scheduled(cron = "*/10 * * * * *") // 10초 간격 실행
	@RequestMapping(value="/hospital/send3", method=RequestMethod.GET)
	public void send3(){
		logger.debug("getAll controller 진입");
		String hospitalCode = "hospital_3";
		transportService.getAll(hospitalCode);
		logger.debug("getAll controller 끝");
	}
	
	//@Scheduled(cron = "*/10 * * * * *") // 10초 간격 실행
	@RequestMapping(value="/hospital/send4", method=RequestMethod.GET)
	public void send4(){
		logger.debug("getAll controller 진입");
		String hospitalCode = "hospital_4";
		transportService.getAll(hospitalCode);
		logger.debug("getAll controller 끝");
	}
	
	//@Scheduled(cron = "*/10 * * * * *") // 10초 간격 실행
	@RequestMapping(value="/hospital/send5", method=RequestMethod.GET)
	public void send5(){
		logger.debug("getAll controller 진입");
		String hospitalCode = "hospital_5";
		transportService.getAll(hospitalCode);
		logger.debug("getAll controller 끝");
	}
}
