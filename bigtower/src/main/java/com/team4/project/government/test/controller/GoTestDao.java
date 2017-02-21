package com.team4.project.government.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoTreatByBloodTest;

@Repository
public class GoTestDao {
	private static final Logger logger = LoggerFactory.getLogger(GoTestDao.class);
	@Autowired
	private SqlSessionTemplate sqlSession;
	

	//날짜로 goBloodTest 결과를 조회한다
	public List<GoBloodTest> selectBlood(GoBloodTest goBloodTest){
		
		return sqlSession.selectList("goTest.selectBlood", goBloodTest);
	}
	//citizenNo 로 treatCode 가져옴
	public List<GoTreatByBloodTest> selectTreatCode(GoTreatByBloodTest goTreatByBloodTest){
		logger.debug("citizenNo 넘어왔는지 확인 : "+goTreatByBloodTest.getGoCitizenNo());
		return sqlSession.selectList("goTest.selectTreatCode", goTreatByBloodTest);
		
	}
	
}
