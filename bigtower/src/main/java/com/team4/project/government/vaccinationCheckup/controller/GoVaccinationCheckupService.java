package com.team4.project.government.vaccinationCheckup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@Service
public class GoVaccinationCheckupService {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupService.class);
	@Autowired
	private GoVaccinationCheckupDao goVaccinationCheckupDao;
	
	//treatCode 받아 하나의 예방접종결과 조회
	public GoVaccinationResult getOneVaccinationResult(String treatCode){
			logger.debug("서비스 , 진료코드를 받아 하나의 예방접종결과 조회");
			logger.debug("매개변수로 받은 treatCode 확인 : "+treatCode);
		return goVaccinationCheckupDao.selectOneVaccinationResult(treatCode);
	}
	
	//citizenId 받아 예방접종결과리스트 조회
	public List<GoVaccinationResult> getListVaccinationResult(String citizenId){
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 citizenId 확인 : "+citizenId);
		return goVaccinationCheckupDao.selectListVaccinationResult(citizenId);
	}
	
	//doctorId 받아 예방접종결과리스트 조회
	public List<GoVaccinationResult> getListVaccinationResultByDoctorId(String doctorId){
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 doctorId 확인 : "+doctorId);
		return goVaccinationCheckupDao.selectListVaccinationResultByDoctorId(doctorId);
	}
	
	//treatCode 받아 하나의 예방접종결과 조회
	public GoCheckup getOneCheckupResult(String treatCode){
			logger.debug("서비스 , 진료코드를 받아 하나의 예방접종결과 조회");
			logger.debug("매개변수로 받은 treatCode 확인 : "+treatCode);
		return goVaccinationCheckupDao.selectOneCheckupResult(treatCode);
	}

	//citizenId 받아 예방접종결과리스트 조회
	public List<GoCheckup> getListCheckupResult(String citizenId){
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 citizenId 확인 : "+citizenId);
		return goVaccinationCheckupDao.selectListCheckupResult(citizenId);
	}
	
	//doctorId 받아 예방접종결과리스트 조회
	public List<GoCheckup> getListCheckupResultByDoctorId(String doctorId){
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 doctorId 확인 : "+doctorId);
		return goVaccinationCheckupDao.selectListCheckupResultByDoctorId(doctorId);
	}
}
