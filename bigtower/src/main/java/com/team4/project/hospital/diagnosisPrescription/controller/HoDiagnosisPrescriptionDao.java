package com.team4.project.hospital.diagnosisPrescription.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HoDiagnosisPrescriptionDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
