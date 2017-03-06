package com.team4.project.government.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoImageTest;

@Repository
public class GoTestDao {
	private static final Logger logger = LoggerFactory.getLogger(GoTestDao.class);
	@Autowired
	private SqlSessionTemplate sql;

	
	//진료코드로 혈액검사결과 하나를 조회한다.
	public GoBloodTest selectOneBloodTestResult(String treatCode){
		logger.debug("혈액검사 Dao");
		logger.debug("traetCode 받았는지 확인 : "+treatCode);
		return sql.selectOne("goTest.selectOneBloodTestResult", treatCode);
	}
	
	//주민번호로 혈액검사결과리스트를 조회한다.
		public List<GoBloodTest> selectListBloodTestResult(String citizenId){
			logger.debug("영상검사 Dao");
			logger.debug("citizenId 받았는지 확인 : "+citizenId);
			return sql.selectList("goTest.selectListBloodTestResult" , citizenId);
		}
		
	//의사코드로 혈액검사결과리스트를 조회한다.
		public List<GoBloodTest> selectListBloodTestResultByDoctorId(String doctorId){
			logger.debug("영상검사 Dao");
			logger.debug("doctorId 받았는지 확인 : "+doctorId);
			return sql.selectList("goTest.selectListBloodTestResultByDoctorId",doctorId);
		}
		

	//진료코드로 영상검사결과 하나를 조회한다.
	public GoImageTest selectOneImageTestResult(String treatCode){
		logger.debug("영상검사 Dao");
		logger.debug("traetCode 받았는지 확인 : "+treatCode);
		return sql.selectOne("goTest.selectOneImageTestResult", treatCode);		
	}
	
	//주민번호로 영상검사결과 리스트를 조회한다.
	public List<GoImageTest> selectListImageTestResult(String citizenId){
		logger.debug("영상검사 Dao");
		logger.debug("citizenId 받았는지 확인 : "+citizenId);
		return sql.selectList("goTest.selectListImageTestResult", citizenId);
	}
	
	//의사코드로 영상검사결과 리스트를 조회한다.
	public List<GoImageTest> selectListImageTestResultByDoctorId(String doctorId){
		logger.debug("영상검사 Dao");
		logger.debug("doctorId 받았는지 확인 : "+doctorId);
		return sql.selectList("goTest.selectListImageTestResultByDoctorId", doctorId);
	}
}
