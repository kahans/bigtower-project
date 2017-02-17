package com.team4.project.government.treatChart.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoTreatChartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
