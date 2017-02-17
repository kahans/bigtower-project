package com.team4.project;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.treatChart.domain.GoTreat;

@Repository
public class TestDao_si {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String TEST_NS = "TreatChart.";
	
	public List<GoTreat> treatList(){
		return sqlSession.selectList(TEST_NS+"treatList");
	}
	
}
