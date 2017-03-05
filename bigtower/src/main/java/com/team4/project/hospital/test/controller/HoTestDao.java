package com.team4.project.hospital.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.test.domain.HoBloodTestSub;
import com.team4.project.hospital.test.domain.HoMediaTestSub;
import com.team4.project.hospital.test.domain.HoTestRequestSub;

@Repository
public class HoTestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
//검사요청 목록
	public List<HoTestRequestSub> mediaList(HoTestRequestSub hmt) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("hoTest.HoTestList", hmt);
	}
	//영상글 뷰
	public HoMediaTestSub mediaTestView(String hoTestRequestCode) {
		System.out.println("DAO "+hoTestRequestCode);
		return sqlSession.selectOne("hoTest.mediaTestAddView", hoTestRequestCode);
	}
	//영상검사 등록 
	public int hoMediaTestAdd(HoMediaTestSub mediaView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.mediaTestAdd", mediaView);
	}
	public List<HoTestRequestSub> bloodTestList(HoTestRequestSub hoTestRequest) {
		System.out.println(hoTestRequest);
		return sqlSession.selectList("hoTest.HoTestList", hoTestRequest);
	}
	public HoBloodTestSub bloodTestView(String hoTestRequestCode) {
		
		return sqlSession.selectOne("hoTest.bloodView", hoTestRequestCode);
	}
	public int hoBloodTestAdd(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.bloodAdd", bloodView);
	}
}
