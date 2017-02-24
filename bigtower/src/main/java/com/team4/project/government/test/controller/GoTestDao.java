package com.team4.project.government.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.test.domain.GoBloodTestTreatSub;
import com.team4.project.government.test.domain.GoImageTestTreatSub;
import com.team4.project.government.test.domain.GoTest;

@Repository
public class GoTestDao {
	private static final Logger logger = LoggerFactory.getLogger(GoTestDao.class);
	@Autowired
	private SqlSessionTemplate sqlSession;
	


	//날짜로 goBloodTest 결과를 조회한다
	public List<GoBloodTestTreatSub> selectBlood(GoTest goTest){
		
		return sqlSession.selectList("goTest.selectBlood", goTest);
	}
	//날짜로 goImageTest 결과를 조회한다
	public  List<GoImageTestTreatSub> selectImage(GoTest goTest){
		
		return sqlSession.selectList("goTest.selectImage", goTest);
		
	}
	
}
