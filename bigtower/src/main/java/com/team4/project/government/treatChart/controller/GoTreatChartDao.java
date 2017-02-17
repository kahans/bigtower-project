package com.team4.project.government.treatChart.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.treatChart.domain.GoTreat;

@Repository
public class GoTreatChartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String TREATCHART_NS = "GoTreatChart.";
	
	public GoTreat goSelectTreat(){
		return sqlSession.selectOne(TREATCHART_NS+"goSelectTreat");
	}
}
