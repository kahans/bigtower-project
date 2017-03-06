package com.team4.project.government.dbInsert.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbInsertDao {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertDao.class);
	@Autowired
	private SqlSessionTemplate sql;
}
