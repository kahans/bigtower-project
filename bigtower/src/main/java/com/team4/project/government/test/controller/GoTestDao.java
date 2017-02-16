package com.team4.project.government.test.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoTestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
