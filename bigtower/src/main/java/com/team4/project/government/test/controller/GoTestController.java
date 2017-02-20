package com.team4.project.government.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.HomeController;
import com.team4.project.government.test.domain.GoBloodTest;

@Controller
public class GoTestController {
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTS;
	
	//혈액검사 요청페이지
	@RequestMapping(value="/goBloodTest", method=RequestMethod.GET)
	public String selectBloodTest(){
		System.out.println("혈액검사요청페이지로 이동");
		return "/governmentYJ/bloodTestResultForm";
	}
	
	//혈액검사 날짜 입력하여 검색 GET요청으로 폼으로 이동하여 POST요청에서 날짜값을 받아야 하지만
	//테스트를 위해 GET방식에서 값을 직접 세팅해주었음. 차후 수정요망
	@RequestMapping(value="/goBloodTest", method=RequestMethod.POST)
	public String selectBloodTest(GoBloodTest goBloodTest){
			System.out.println("혈액검사 요청페이지에서 날짜 넘겨받음");
			//goBloodTest에 입력받은 날짜를 직접세팅해줌 
		/*	goBloodTest.setGoFirstDate("2016-02-20");
			goBloodTest.setGoSecondDate("2017-02-20");*/
			
			//goBloodTest에 직접 입력해준 값이 들어왔는지 확인(차후에는 넘겨받은 값을 확인)
			logger.debug("goBloodTest : "+goBloodTest.toString());
			System.out.println("입력받은 날짜 확인 : "+goBloodTest.getGoFirstDate());
			System.out.println("입력받은 날짜 확인 : "+goBloodTest.getGoSecondDate());
			//입력받은 날짜를 가지고 검색한 후 그 값을 goTest에 담음
			List<GoBloodTest> goTest= goTS.selectBlood(goBloodTest);
			
			//for문을 통해 검색을 통해 가져온 객체를 확인해봄.
			for(GoBloodTest x : goTest){
				logger.debug("확인 : "+x.toString());
			}
				
		return "/governmentYJ/bloodTestResultSearch";
	}
	
	//한명의 환자의 혈당수치리스트를 조회함.
	@RequestMapping(value="/goBloodTestSugar", method=RequestMethod.GET)
	public String selectBloodTestSugar(GoBloodTest goBloodTest){
		//goBloodTest에 진료코드를 세팅해주고 조회(추후 goBloodTest객체에 값이 들어있을예정)
		goBloodTest.setGoTreatCode("treat_01");
		
		//goBloodTest에 직접 입력해준 값이 들어왔는지 확인
		logger.debug("goBloodTestSugar :"+goBloodTest.toString());
		//입력받은 날짜를 가지고 검색한 후 그 값을 goTestSugar에 담음
		List<GoBloodTest> goTestSugar = goTS.selectBloodSugar(goBloodTest);
		//for문을 통해 가져온 객체를 확인
		for(GoBloodTest x : goTestSugar){
			logger.debug("확인 : " +x.toString());
		}
		
		return "";
	}
}
