package com.team4.project.government.hopitalizationSurgery.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoHospitalizationSurgeryDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
