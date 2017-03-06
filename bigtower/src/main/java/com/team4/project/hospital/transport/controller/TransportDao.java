package com.team4.project.hospital.transport.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransportDao {
	private static final Logger logger = LoggerFactory.getLogger(TransportDao.class);
	@Autowired
	private SqlSessionTemplate sql;
}
