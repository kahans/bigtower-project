package com.team4.project.hospital.test.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HoTestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
