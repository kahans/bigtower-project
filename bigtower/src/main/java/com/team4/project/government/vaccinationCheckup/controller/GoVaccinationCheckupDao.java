package com.team4.project.government.vaccinationCheckup.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoVaccinationCheckupDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
