package com.team4.project.government.test.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.test.domain.GoBloodTestTreatSub;
import com.team4.project.government.test.domain.GoImageTestTreatSub;
import com.team4.project.government.test.domain.GoTest;
import com.team4.project.government.test.domain.SelectInfo;
import com.team4.project.util.Util;

@Service
public class GoTestService {
	GoTest goTestResult = new GoTest();
	private static final Logger logger = LoggerFactory.getLogger(GoTestService.class);

	@Autowired
	private GoTestDao goTD;
	

	
	//혈액검사결과 요청
		public GoTest selectBloodTest(GoTest goTest){
			GoTest goTestResult = new GoTest();
			logger.debug("서비스로 요청 들어옴");
		
			
				//goTest에서 hospitalName, doctorName 분리해서 sql에 넣을때 해당 단어를 포함하는
				//단어를 검색하도록 바꿔 세팅해줌
				StringBuffer changeDoctorName = new StringBuffer();
				String getDoctorName = goTest.getGoDoctorName();
				logger.debug("입력받은 의사명 : "+getDoctorName);
				changeDoctorName.append("%");
				changeDoctorName.append(getDoctorName);
				changeDoctorName.append("%");
				goTest.setGoDoctorName(changeDoctorName.toString());
				logger.debug("의사이름 제대로 세팅됬는지 확인 : "+goTest.getGoDoctorName());
			
			
				StringBuffer changeHospitalName = new StringBuffer();
				String getHospitalName = goTest.getGoHospitalName();
				logger.debug("입력받은 병원명 :"+getHospitalName);
				changeHospitalName.append("%");
				changeHospitalName.append(getHospitalName);
				changeHospitalName.append("%");
				goTest.setGoHospitalName(changeHospitalName.toString());
				logger.debug("병원명 제대로 세팅됬는지 확인 : "+goTest.getGoHospitalName());
		
			
			//goTest에서 날짜 분리해서 Util클래스에 생성해놓은 날짜생성 메소드에 입력
			String firstDate = goTest.getGoFirstDate();
			String secondDate = goTest.getGoSecondDate();
			logger.debug("firstDate 확인 : "+firstDate+"\n"+"secondDate 확인 :"+secondDate);
			 
			Map<String,Object> map = Util.createDate(firstDate, secondDate);
			firstDate = (String) map.get("firstDate");
			secondDate = (String) map.get("secondDate");
			logger.debug("firstDate 확인 : "+firstDate+"\n"+"secondDate 확인 :"+secondDate);
			
			goTest.setGoFirstDate(firstDate);
			goTest.setGoSecondDate(secondDate);
			
			logger.debug("goTest에 날짜 세팅됬는지 확인 : "+goTest.getGoFirstDate()+"\n"+"두번째 : "+goTest.getGoSecondDate());
			
			//bloodTest리스트로 받아옴
			try{
				List<GoBloodTestTreatSub> bloodTest = goTD.selectBlood(goTest);
				
				//bloodTest 제대로 받아왔는지 for문으로 확인
				for(int x=0; x<bloodTest.size(); x++){
					logger.debug("bloodTest 확인 : "+bloodTest.get(x).toString());
				}
				//bloodTest의 size를 goTest객체에 담음
				goTestResult.setSelectBloodTestCount(bloodTest.size());
				
				//확인된 bloodTest를 goTest객체에 담음
				for(int i=0; i<bloodTest.size(); i++){
					goTestResult.setGoBloodTestTreatSub(bloodTest);
				}
			
				//객체에 
				logger.debug("서비스에서 bloodTest확인 : "+goTestResult.getGoBloodTestTreatSub().toString());
			}catch(Exception e){
				logger.debug("예외발생");
				e.printStackTrace();
			}finally{
				return 	goTestResult;
			}
			
		}
		
	//이미지 검색결과 요청
	public GoTest selectImageTest(GoTest goTest){
		GoTest goTestResult = new GoTest();
		//goTest에서 날짜 분리해서 Util클래스에 생성해놓은 날짜생성 메소드에 입력
		String firstDate = goTest.getGoFirstDate();
		String secondDate = goTest.getGoSecondDate();
		logger.debug("firstDate 확인 : "+firstDate+"\n"+"secondDate 확인 :"+secondDate);
		 
		Map<String,Object> map = Util.createDate(firstDate, secondDate);
		firstDate = (String) map.get("firstDate");
		secondDate = (String) map.get("secondDate");
		logger.debug("firstDate 확인 : "+firstDate+"\n"+"secondDate 확인 :"+secondDate);
		
		goTest.setGoFirstDate(firstDate);
		goTest.setGoSecondDate(secondDate);
		
		logger.debug("goTest에 날짜 세팅됬는지 확인 : "+goTest.getGoFirstDate()+"\n"+"두번째 : "+goTest.getGoSecondDate());
		
		List<GoImageTestTreatSub> imageTest = goTD.selectImage(goTest);
			for(int x=0; x<imageTest.size(); x++)
				logger.debug("imageTest 확인 : " + imageTest.get(x).toString());
			for(int i=0; i<imageTest.size(); i++){
				goTestResult.setGoImageTestTreatSub(imageTest);
			}
			logger.debug("서비스에서 확인 : "+goTestResult.getGoImageTestTreatSub().toString());
		return goTestResult;
	}
	
	
}