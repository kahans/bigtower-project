package com.team4.project.government.diagnosisPrescription.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoDiagnosisPrescriptionDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
