package com.team4.project.government.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoTest;

@Service
public class GoTestService {
	GoTest goTestResult = new GoTest();
	private static final Logger logger = LoggerFactory.getLogger(GoTestService.class);

	@Autowired
	private GoTestDao goTD;
	
	public GoTest selectBloodTest(GoTest goTest){
		
		logger.debug("서비스로 요청 들어옴");
	
		//goTest 에서 날짜 분리해서 값이 입력되지 않았을때 if문을 사용하여 초기값을 만들어 넣어줌
		Date date = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentdate = transFormat.format(date);
		System.out.println("currentDate 확인 : "+currentdate);
		if(goTest.getGoFirstDate()==""&goTest.getGoSecondDate()==""){
			goTest.setGoFirstDate("1900-01-01");
			goTest.setGoSecondDate(currentdate);
			logger.debug("firstDate 확인 : "+goTest.getGoFirstDate());
			logger.debug("secondDate 들어갔는지 확인 : "+goTest.getGoSecondDate());
			logger.debug("둘다 공백일때");
		}else if(goTest.getGoFirstDate()==""){
			goTest.setGoFirstDate("1900-01-01");
			logger.debug("firstDate 확인 : "+goTest.getGoFirstDate());
			logger.debug("앞이 공백일때");
		}else{
			goTest.setGoSecondDate(currentdate);
			logger.debug("secondDate 들어갔는지 확인 : "+goTest.getGoSecondDate());
			logger.debug("뒤가 공백일때");
		}
		
		//bloodTest리스트로 받아옴
		List<GoBloodTest> bloodTest = goTD.selectBlood(goTest);
		//bloodTest 제대로 받아왔는지 for문으로 확인
		for(int x=0; x<bloodTest.size(); x++){
			logger.debug("bloodTest 확인 : "+bloodTest.get(x).toString());
		}
		
		//확인된 bloodTest를 goTest객체에 담음
		for(int i=0; i<bloodTest.size(); i++){
			goTestResult.setGoBloodTest(bloodTest);
		}
		//객체에 
		logger.debug("서비스에서 확인 : "+goTestResult.getGoBloodTest().toString());
		return 	goTestResult;
		
	}
}