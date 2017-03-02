package com.team4.project.hospital.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.test.domain.HoMediaTest;

@Repository
public class HoTestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<HoMediaTest> mediaList(HoMediaTest hmt) {
		// TODO Auto-generated method stub
		return null;
	}
}
