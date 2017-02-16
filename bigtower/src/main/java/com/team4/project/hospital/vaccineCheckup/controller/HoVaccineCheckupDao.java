package com.team4.project.hospital.vaccineCheckup.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HoVaccineCheckupDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
