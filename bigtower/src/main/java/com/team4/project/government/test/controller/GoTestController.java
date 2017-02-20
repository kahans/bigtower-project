package com.team4.project.government.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.HomeController;
import com.team4.project.government.test.domain.GoBloodTest;

@Controller
public class GoTestController {
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTS;
	
	//
	@RequestMapping(value="/goBloodTest", method=RequestMethod.GET)
	public String selectBloodTest(){
		System.out.println("혈액검사 요청페이지로 이동");
		return "/governmentYJ/bloodTestResultForm";
	}
	
	//
	@RequestMapping(value="/goBloodTest", method=RequestMethod.POST)
	public String selectBloodTest(Model model, GoBloodTest goBloodTest){
			System.out.println("혈액검사 요청페이지에서 날짜,진료코드 넘겨받음");

			
		
			logger.debug("goBloodTest : "+goBloodTest.toString());
			System.out.println(" 시작일 넘겨받았는지 확인 : "+goBloodTest.getGoFirstDate());
			System.out.println(" 종료일 넘겨받았는지 확인 : "+goBloodTest.getGoSecondDate());
			System.out.println(" 진료코드 넘어왔는지 확인 : "+goBloodTest.getGoTreatCode());
		
			List<GoBloodTest> goTest= goTS.selectBlood(goBloodTest);
		
			for(GoBloodTest x : goTest){
				logger.debug(" : "+x.toString());
			}
			model.addAttribute("goTest", goTest);	
		return "/governmentYJ/bloodTestResult";
	}

}
