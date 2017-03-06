package com.team4.project.government.vaccinationCheckup.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@Repository
public class GoVaccinationCheckupDao {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupDao.class);
	
	@Autowired
	private SqlSessionTemplate sql;
	//예방접종 목록 가져오기
	
	//treatCode 입력받아 하나의 예방접종결과 조회
	public GoVaccinationResult selectOneVaccinationResult(String treatCode){
		logger.debug("Vaccination Dao");
		logger.debug("treatCode 확인 : "+treatCode);
		return sql.selectOne("GoVaccinationCheckup.selectOneVaccinationResult",treatCode);
	}
	
	//citizenId 입력받아 예방접종결과 리스트 조회
	public List<GoVaccinationResult> selectListVaccinationResult(String citizenId){
		logger.debug("Vaccination Dao");
		logger.debug("citizenId 확인 : "+citizenId);
		return sql.selectList("GoVaccinationCheckup.selectListVaccinationResult",citizenId);
	}
	
	//doctorId 입력받아 예방접종결과 리스트 조회
	public List<GoVaccinationResult> selectListVaccinationResultByDoctorId(String doctorId){
		logger.debug("Vaccination Dao");
		logger.debug("doctorId 확인 : "+doctorId);
		return sql.selectList("GoVaccinationCheckup.selectListVaccinationResultByDoctorId",doctorId);
	}
	
	
	//treatCode 입력받아 하나의 건강검진결과 조회
	public GoCheckup selectOneCheckupResult(String treatCode){
		logger.debug("checkup Dao");
		logger.debug("treatCode 확인 : "+treatCode);
		return sql.selectOne("GoVaccinationCheckup.selectOneCheckupResult",treatCode);
	}
	
	//citizenId 입력받아 예방접종결과 리스트 조회
	public List<GoCheckup> selectListCheckupResult(String citizenId){
		logger.debug("checkup Dao");
		logger.debug("citizenId 확인 : "+citizenId);
		return sql.selectList("GoVaccinationCheckup.selectListCheckupResult",citizenId);
	}
	
	//doctorId 입력받아 예방접종결과 리스트 조회
	public List<GoCheckup> selectListCheckupResultByDoctorId(String doctorId){
		logger.debug("checkup Dao");
		logger.debug("doctorId 확인 : "+doctorId);
		return sql.selectList("GoVaccinationCheckup.selectListCheckupResultByDoctorId",doctorId);
	}
	
	

}
