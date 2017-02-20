package com.team4.project.government.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.test.domain.GoBloodTest;

@Service
public class GoTestService {

	@Autowired
	private GoTestDao goTD;
	//진료코드와 기간으로 GoBloodTest를 조회함
	public List<GoBloodTest> selectBlood(GoBloodTest goBloodTest){
		//goBloodTest 에서 날짜 쪼갬
		System.out.println("혈액검사 서비스 영역");
		Date date = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentdate = transFormat.format(date);
		System.out.println("currentDate 확인 : "+currentdate);
		if(goBloodTest.getGoFirstDate()==""&goBloodTest.getGoSecondDate()==""){
			goBloodTest.setGoFirstDate("1900-01-01");
			goBloodTest.setGoSecondDate(currentdate);
			System.out.println("firstDate 확인 : "+goBloodTest.getGoFirstDate());
			System.out.println("secondDate 들어갔는지 확인 : "+goBloodTest.getGoSecondDate());
			System.out.println("둘다 공백일때");
		}else if(goBloodTest.getGoFirstDate()==""){
			goBloodTest.setGoFirstDate("1900-01-01");
			System.out.println("firstDate 확인 : "+goBloodTest.getGoFirstDate());
			System.out.println("앞이 공백일때");
		}else{
			
			goBloodTest.setGoSecondDate(currentdate);
			System.out.println("secondDate 들어갔는지 확인 : "+goBloodTest.getGoSecondDate());
			System.out.println("뒤가 공백일때");
		}
		
		
		return goTD.selectBlood(goBloodTest);
	}

}
