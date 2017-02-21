package com.team4.project.hospital.controller;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.dto.HoStaff;

@Repository
public class HospitalDao {
	@Autowired
	private SqlSessionTemplate sql;
	
	public HoStaff loginCheck(Map<String,String> map){
		return sql.selectOne("hospital.loginCheck",map);
	}
}
