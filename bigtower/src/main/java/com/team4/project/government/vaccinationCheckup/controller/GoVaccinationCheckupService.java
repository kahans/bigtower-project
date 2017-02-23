package com.team4.project.government.vaccinationCheckup.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.vaccinationCheckup.domain.GoCheckupTreatSub;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResultTreatSub;
import com.team4.project.util.Util;

@Service
public class GoVaccinationCheckupService {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupService.class);
	@Autowired
	private GoVaccinationCheckupDao goVCD;
	
	public GoVaccinationCheckup vaccinationList(GoVaccinationCheckup govaccination){
		
		GoVaccinationCheckup goVaccinationResult= new GoVaccinationCheckup();
		logger.debug("check up 서비스 요청 들어옴");
		//goVaccinationResult에서 날짜 분리해서 Util 클래스에 생성해놓은 날짜생성 메소드 입력
		String firstDate = govaccination.getFirstDate();
		String secondDate = govaccination.getSecondDate();
		logger.debug("firstDate 확인 : "+firstDate+"\n"+"secondDate 확인 :"+secondDate);
		
		Map<String,Object> map = Util.createDate(firstDate, secondDate);
		firstDate = (String) map.get("firstDate");
		secondDate = (String) map.get("secondDate");
		logger.debug("firstDate 확인 : " +firstDate+"/n"+"secondDate 확인 : "+secondDate);
		
		govaccination.setFirstDate(firstDate);
		govaccination.setSecondDate(secondDate);
		
		logger.debug("goCheckupResult에 날짜 세팅됬는지 확인 : "+govaccination.getFirstDate()+"\n"+"두번째 : "+govaccination.getSecondDate());
		//checkup리스트로 받아옴
		List<GoVaccinationResultTreatSub> vaccination = goVCD.vaccinationList(govaccination);
		//checkup을 제대로 받았는지 for문으로 확인
		for(int x=0; x<vaccination.size();x++){
			logger.debug("checkup 확인 : " + vaccination.get(x).toString());
		}
		//확인된 checkup을 goCheckupResult객체에 담음
		for(int i=0; i<vaccination.size();i++){
			goVaccinationResult.setGoVaccinationResultTreatSub(vaccination);
		}
		
		return goVaccinationResult;
	}
	//건강검진 결과 목록가져오기
	public GoVaccinationCheckup checkUpList(GoVaccinationCheckup gocheckup){
		GoVaccinationCheckup goCheckupResult= new GoVaccinationCheckup();
		logger.debug("check up 서비스 요청 들어옴");
		//goCheckupResult에서 날짜 분리해서 Util 클래스에 생성해놓은 날짜생성 메소드 입력
		String firstDate = gocheckup.getFirstDate();
		String secondDate = gocheckup.getSecondDate();
		logger.debug("firstDate 확인 : "+firstDate+"\n"+"secondDate 확인 :"+secondDate);
		
		Map<String,Object> map = Util.createDate(firstDate, secondDate);
		firstDate = (String) map.get("firstDate");
		secondDate = (String) map.get("secondDate");
		logger.debug("firstDate 확인 : " +firstDate+"/n"+"secondDate 확인 : "+secondDate);
		
		gocheckup.setFirstDate(firstDate);
		gocheckup.setSecondDate(secondDate);
		
		logger.debug("goCheckupResult에 날짜 세팅됬는지 확인 : "+gocheckup.getFirstDate()+"\n"+"두번째 : "+gocheckup.getSecondDate());
		//checkup리스트로 받아옴
		List<GoCheckupTreatSub> checkup = goVCD.checkUpList(gocheckup);
		//checkup을 제대로 받았는지 for문으로 확인
		for(int x=0; x<checkup.size();x++){
			logger.debug("checkup 확인 : " + checkup.get(x).toString());
		}
		//확인된 checkup을 goCheckupResult객체에 담음
		for(int i=0; i<checkup.size();i++){
			goCheckupResult.setGoCheckupTreatSub(checkup);
		}
		
		return goCheckupResult;
	}
}
