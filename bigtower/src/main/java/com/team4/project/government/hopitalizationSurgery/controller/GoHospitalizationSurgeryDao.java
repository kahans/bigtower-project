package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.hopitalizationSurgery.domain.GoSurgery;

@Repository
public class GoHospitalizationSurgeryDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	private final String SURGERY_NS = "GoHospitalizationSurgery.";
	public List<GoSurgery> goSurgeryList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(SURGERY_NS+"SurgeryList");
	}
}
