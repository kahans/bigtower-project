package com.team4.project.government.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoTreatByBloodTest;

@Service
public class GoTestService {
	private static final Logger logger = LoggerFactory.getLogger(GoTestService.class);

	@Autowired
	private GoTestDao goTD;
	
	public List<GoTreatByBloodTest> selectTreatCode(GoTreatByBloodTest goTreatByBloodTest){
		
		GoBloodTest goBloodTest = new GoBloodTest();
		logger.debug("서비스로 요청 들어옴");
		List<GoTreatByBloodTest> bt = goTD.selectTreatCode(goTreatByBloodTest);

		//goTreatByBloodTest 에서 날짜 분리해서 값이 입력되지 않았을때 if문을 사용하여 초기값을 만들어 넣어줌
		Date date = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentdate = transFormat.format(date);
		System.out.println("currentDate 확인 : "+currentdate);
		if(goTreatByBloodTest.getGoFirstDate()==""&goTreatByBloodTest.getGoSecondDate()==""){
			goTreatByBloodTest.setGoFirstDate("1900-01-01");
			goTreatByBloodTest.setGoSecondDate(currentdate);
			logger.debug("firstDate 확인 : "+goTreatByBloodTest.getGoFirstDate());
			logger.debug("secondDate 들어갔는지 확인 : "+goTreatByBloodTest.getGoSecondDate());
			logger.debug("둘다 공백일때");
		}else if(goTreatByBloodTest.getGoFirstDate()==""){
			goTreatByBloodTest.setGoFirstDate("1900-01-01");
			logger.debug("firstDate 확인 : "+goTreatByBloodTest.getGoFirstDate());
			logger.debug("앞이 공백일때");
		}else{
			goTreatByBloodTest.setGoSecondDate(currentdate);
			logger.debug("secondDate 들어갔는지 확인 : "+goTreatByBloodTest.getGoSecondDate());
			logger.debug("뒤가 공백일때");
		}
		
		
		// bt(bloodTest)의 크기만큼 for문을 돌려 GoBloodTest객체를 list에 담아서 GoTreatByBloodTest객체의 필드변수
		//List<goBloodTest> 에 담는다.
		for(int i=0; i<bt.size(); i++){
			System.out.println("확인 :"+bt.get(i).getGoTreatCode());
			String treatCode = bt.get(i).getGoTreatCode();
			goBloodTest.setGoTreatCode(treatCode);
			goBloodTest.setGoFirstDate(goTreatByBloodTest.getGoFirstDate());
			goBloodTest.setGoSecondDate(goTreatByBloodTest.getGoSecondDate());
			List<GoBloodTest> bloodTest = goTD.selectBlood(goBloodTest);
			bt.get(i).setGoBloodTest(bloodTest);
			
		}
		logger.debug("서비스에서 확인 : "+bt.get(0).getGoBloodTest());
		return 	bt;
		
	}
}