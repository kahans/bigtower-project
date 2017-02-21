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
		System.out.println("서비스로 요청 들어옴");
		List<GoTreatByBloodTest> bt = goTD.selectTreatCode(goTreatByBloodTest);
		//treatCode 가져왔는지 확인
		
		System.out.println("혈액검사 서비스 영역");
		Date date = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentdate = transFormat.format(date);
		System.out.println("currentDate 확인 : "+currentdate);
		if(goTreatByBloodTest.getGoFirstDate()==""&goTreatByBloodTest.getGoSecondDate()==""){
			goTreatByBloodTest.setGoFirstDate("1900-01-01");
			goTreatByBloodTest.setGoSecondDate(currentdate);
			System.out.println("firstDate 확인 : "+goTreatByBloodTest.getGoFirstDate());
			System.out.println("secondDate 들어갔는지 확인 : "+goTreatByBloodTest.getGoSecondDate());
			System.out.println("둘다 공백일때");
		}else if(goTreatByBloodTest.getGoFirstDate()==""){
			goTreatByBloodTest.setGoFirstDate("1900-01-01");
			System.out.println("firstDate 확인 : "+goTreatByBloodTest.getGoFirstDate());
			System.out.println("앞이 공백일때");
		}else{
			goTreatByBloodTest.setGoSecondDate(currentdate);
			System.out.println("secondDate 들어갔는지 확인 : "+goTreatByBloodTest.getGoSecondDate());
			System.out.println("뒤가 공백일때");
		}
		
		
		
		for(int i=0; i<bt.size(); i++){
			System.out.println("확인 :"+bt.get(i).getGoTreatCode());
			String treatCode = bt.get(i).getGoTreatCode();
			goBloodTest.setGoTreatCode(treatCode);
			goBloodTest.setGoFirstDate(goTreatByBloodTest.getGoFirstDate());
			goBloodTest.setGoSecondDate(goTreatByBloodTest.getGoSecondDate());
			List<GoBloodTest> bloodTest = goTD.selectBlood(goBloodTest);
			bt.get(i).setGoBloodTest(bloodTest);
			
		}
		System.out.println("서비스에서 확인 : "+bt.get(0).getGoBloodTest());
		return 	bt;
		
	}
	
	
	
	
	
	
/*	//진료코드와 기간으로 GoBloodTest를 조회함
	public List<GoBloodTest> selectBlood(Model model,GoBloodTest goBloodTest){
		
			//for문을 통해 treatCodeList에서 treatCode를 분리
			
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
			
				
			return ;

	}*/
}