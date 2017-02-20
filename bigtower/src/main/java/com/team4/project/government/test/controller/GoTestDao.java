package com.team4.project.government.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.test.domain.GoBloodTest;

@Repository
public class GoTestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	//날짜로 goBloodTest 결과를 조회한다
	public List<GoBloodTest> selectBlood(GoBloodTest goBloodTest){
		
		return sqlSession.selectList("goTest.selectBlood", goBloodTest);
	}
	public List<GoBloodTest> selectBloodSugar(GoBloodTest goBloodTest){
		return sqlSession.selectList("goTest.selectBloodSugar", goBloodTest);
		
	}
}
