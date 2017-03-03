package com.team4.project.hospital.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.test.domain.HoMediaTestSub;
import com.team4.project.hospital.test.domain.HoTestRequestSub;

@Repository
public class HoTestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
//검사요청 목록
	public List<HoTestRequestSub> mediaList(HoTestRequestSub hmt) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("hoTest.HoMediaTest", hmt);
	}

	public HoMediaTestSub mediaTestView(String hoTestRequestCode) {
		// 
		return sqlSession.selectOne("hoTest.mediaTestAddView", hoTestRequestCode);
	}

	public int hoMediaTestAdd(HoMediaTestSub hmts) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.mediaTestAdd", hmts);
	}
}
