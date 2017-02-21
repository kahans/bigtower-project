package com.team4.project.government.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoTreatByBloodTest;

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
	public String selectBloodTest(Model model, GoTreatByBloodTest goTreatByBloodTest){
			logger.debug("혈액검사 요청페이지에서 날짜,citizenNo 넘겨받음");

			logger.debug("주민번호 확인 : "+goTreatByBloodTest.getGoCitizenNo());
			List<GoTreatByBloodTest> governmentBloodTest = goTS.selectTreatCode(goTreatByBloodTest);
			
			//진료코드와 날짜를 입력받아 goBloodTest객체참조변수에 담아 조건에 맞는 열을 goTest list에 담는다.
			
		
			//for문을 통해 list에 객체가 잘 담겨있는지 확인
			
			//모델에 list타입 객체를 담음
			model.addAttribute("goTest",governmentBloodTest);
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
	public String selectImgTest(Model model){
		return "";
		
	}
	

}
