package com.team4.project.government.reservation.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoReservationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
