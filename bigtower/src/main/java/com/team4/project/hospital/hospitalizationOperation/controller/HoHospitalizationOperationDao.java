package com.team4.project.hospital.hospitalizationOperation.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HoHospitalizationOperationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
