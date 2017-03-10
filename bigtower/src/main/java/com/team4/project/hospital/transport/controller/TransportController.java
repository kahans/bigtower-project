package com.team4.project.hospital.transport.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
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
/*	
	@Scheduled(cron = "0/10 * * * * *") // 10초 간격 실행
	//@RequestMapping(value="/hospital/send1", method=RequestMethod.GET)
	public void send1(){
		logger.debug("send1 controller 진입");
		String hospitalCode = "hospital_1";
		transportService.getAll(hospitalCode);
		logger.debug("send1 controller 끝");
	}
	
	@Scheduled(cron = "2/10 * * * * *") // 10초 간격 실행
	//@RequestMapping(value="/hospital/send2", method=RequestMethod.GET)
	public void send2(){
		logger.debug("send2 controller 진입");
		String hospitalCode = "hospital_2";
		transportService.getAll(hospitalCode);
		logger.debug("send2 controller 끝");
	}
	
	@Scheduled(cron = "4/10 * * * * *") // 10초 간격 실행
	//@RequestMapping(value="/hospital/send3", method=RequestMethod.GET)
	public void send3(){
		logger.debug("send3 controller 진입");
		String hospitalCode = "hospital_3";
		transportService.getAll(hospitalCode);
		logger.debug("send3 controller 끝");
	}
	
	@Scheduled(cron = "6/10 * * * * *") // 10초 간격 실행
	//@RequestMapping(value="/hospital/send4", method=RequestMethod.GET)
	public void send4(){
		logger.debug("send4 controller 진입");
		String hospitalCode = "hospital_4";
		transportService.getAll(hospitalCode);
		logger.debug("send4 controller 끝");
	}
	
	@Scheduled(cron = "8/10 * * * * *") // 10초 간격 실행
	//@RequestMapping(value="/hospital/send5", method=RequestMethod.GET)
	public void send5(){
		logger.debug("send5 controller 진입");
		String hospitalCode = "hospital_5";
		transportService.getAll(hospitalCode);
		logger.debug("send5 controller 끝");
	}*/
}
