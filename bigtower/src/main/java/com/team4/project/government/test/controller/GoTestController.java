package com.team4.project.government.test.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.government.test.domain.GoTest;

@Controller
public class GoTestController {
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTS;
	
	
	
	//검사페이지로 요청
	@RequestMapping(value="/government/goTest" , method=RequestMethod.GET)
	public String testRequest(){
		logger.debug("검사요청들어옴 혈액검사,영상검사,건강검진,예방접종으로 이동할 수 있게 경로 잡아준 페이지로 이동");
		return "/government/citizen/testVaccinationCheckup/test";
	}
	
	
	
	//혈액검사요청페이지
	@RequestMapping(value="/government/goBloodTest", method=RequestMethod.GET)
	public String selectBloodTest(){
		System.out.println("혈액검사 요청페이지로 이동");
		return "/government/citizen/testVaccinationCheckup/bloodTest";
	}
	
	//혈액검사 요청페이지에서 날짜 citizenNo 넘겨받음 citizenNo는 추후에 로그인정보에서 citizenNO 혹은 주민번호를 받아 올 예정
	//주민번호를 받게되면 DTo와 mapper 수정해야함.
	@RequestMapping(value="/government/goBloodTest", method=RequestMethod.POST)
	public String selectBloodTest(Model model, GoTest goTest,HttpSession session){
		if(session.getAttribute("GOCITIZENID").equals(null)){
			System.out.println("session 확인 : "+session.getAttribute("GOCITIZENID"));
			logger.debug("session에 goCitizenId가 없을때");
			return "/goTest";
		}else{
		
		//세션 임의로 만들어서 넣어줌 테스트할때 매개변수로 httpSession session 받아야함
		System.out.println("세션확인 : "+session.getAttribute("GOCITIZENID"));
		String goCitizenId = (String) session.getAttribute("GOCITIZENID");
		goTest.setGoCitizenId(goCitizenId);
		//여기까지
	
		
			logger.debug("혈액검사 요청페이지에서 날짜 넘겨받음");

			logger.debug("주민번호 확인 : "+goTest.getGoCitizenId());
			GoTest goBloodTest = goTS.selectBloodTest(goTest);
			
			//모델에 list타입 객체를 담음
			model.addAttribute("goTestBlood",goBloodTest);
			
			//view 페이지로 포워딩
		return "/government/citizen/testVaccinationCheckup/bloodTestResult";
		}
	}
	
	//영상검사 요청페이지
	@RequestMapping(value="/government/goImageTest" , method=RequestMethod.GET)
	public String selectImgTest(){
		logger.debug("img요청페이지");
		return "/government/citizen/testVaccinationCheckup/imgTest";
		
	}
	
	//영상검사 요청페이지에서 날짜 citizenNo 넘겨받음 citizenNo는 추후에 로그인정보에서 citizenNO 혹은 주민번호를 받아 올 예정
	//주민번호를 받게되면 DTo와 mapper 수정해야함.
	@RequestMapping(value="/government/goImageTest" , method=RequestMethod.POST)
	public String selectImgTest(Model model, GoTest goTest, HttpSession session){
		if(session.getAttribute("GOCITIZENID").equals(null)){
			logger.debug("session에 goCitizenId가 없을때");
			return "";
		}else{
		//세션 받아서 goTest객체에 담아줌
		System.out.println("세션확인 : "+session.getAttribute("GOCITIZENID"));
		String goCitizenId = (String) session.getAttribute("GOCITIZENID");
		goTest.setGoCitizenId(goCitizenId);
		
		
			logger.debug("citizenId 확인 : "+goTest.getGoCitizenId());
			logger.debug("입력받은 날짜 확인 : "+goTest.getGoFirstDate()+" , "+goTest.getGoSecondDate());
			
			GoTest goImageTest = goTS.selectImageTest(goTest);
			//모델에 이미지결과 받아온 list를 담음
			model.addAttribute("goImageTest",goImageTest);
		return "/government/citizen/testVaccinationCheckup/imgTestResult";
		}
	}
	

}
