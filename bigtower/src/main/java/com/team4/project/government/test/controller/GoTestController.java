package com.team4.project.government.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.government.test.domain.GoImageTest;
import com.team4.project.government.test.domain.GoTest;

@Controller
public class GoTestController {
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTS;
	
	//혈액검사요청페이지
	@RequestMapping(value="/goBloodTest", method=RequestMethod.GET)
	public String selectBloodTest(){
		System.out.println("혈액검사 요청페이지로 이동");
		return "/governmentYJ/bloodTestResultForm";
	}
	
	//혈액검사 요청페이지에서 날짜 citizenNo 넘겨받음 citizenNo는 추후에 로그인정보에서 citizenNO 혹은 주민번호를 받아 올 예정
	//주민번호를 받게되면 DTo와 mapper 수정해야함.
	@RequestMapping(value="/goBloodTest", method=RequestMethod.POST)
	public String selectBloodTest(Model model, GoTest goTest){
			logger.debug("혈액검사 요청페이지에서 날짜,citizenNo 넘겨받음");

			logger.debug("주민번호 확인 : "+goTest.getGoCitizenId());
			GoTest goBloodTest = goTS.selectBloodTest(goTest);
			//모델에 list타입 객체를 담음
			model.addAttribute("goTestBlood",goBloodTest);
			//view 페이지로 포워딩
		return "/governmentYJ/bloodTestResult";
	}
	
	//영상검사 요청페이지
	@RequestMapping(value="/goImgTest" , method=RequestMethod.GET)
	public String selectImgTest(){
		logger.debug("img요청페이지");
		return "/governmentYJ/imgTest";
		
	}
	
	//영상검사 요청페이지에서 날짜 citizenNo 넘겨받음 citizenNo는 추후에 로그인정보에서 citizenNO 혹은 주민번호를 받아 올 예정
	//주민번호를 받게되면 DTo와 mapper 수정해야함.
	@RequestMapping(value="/goImgTest" , method=RequestMethod.POST)
	public String selectImgTest(Model model, GoTest goTest){
			logger.debug("citizenId 확인 : "+goTest.getGoCitizenId());
			logger.debug("입력받은 날짜 확인 : "+goTest.getGoFirstDate()+" , "+goTest.getGoSecondDate());
			
			GoTest goImageTest = goTS.selectImageTest(goTest);
			//모델에 이미지결과 받아온 list를 담음
			model.addAttribute("goImageTest",goImageTest);
		return "/governmentYJ/imgTestResult";
		
	}
	

}
