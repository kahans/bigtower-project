package com.team4.project.government.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;

@Repository
public class GovernmentDao {
	@Autowired
	private SqlSessionTemplate sql;
	//국민 로그인체크
	public GoCitizen loginCheck(GoCitizen goCitizen){
		return sql.selectOne("government.citizenLoginCheck", goCitizen); 
	}
	//병원 로그인체크
	public GoHospital loginCheck(GoHospital goHospital){
		return sql.selectOne("government.hospitalLoginCheck", goHospital); 
	}
}
