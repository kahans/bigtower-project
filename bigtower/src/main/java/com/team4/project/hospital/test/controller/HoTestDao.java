package com.team4.project.hospital.test.controller;

import java.util.List;
import java.util.Map;

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
		return sqlSession.selectList("hoTest.listHoTest", hmt);
	}

	public List<HoTestRequestSub> bloodTestList(HoTestRequestSub hoTestRequest) {
		System.out.println(hoTestRequest);
		return sqlSession.selectList("hoTest.listHoTest", hoTestRequest);
	}
	//영상글 뷰
	public HoMediaTestSub mediaTestView(String hoTestRequestCode) {
		System.out.println("DAO "+hoTestRequestCode);
		return sqlSession.selectOne("hoTest.addMediaTestView", hoTestRequestCode);
	}
	
	//영상검사 등록 
	public int hoMediaTestAdd(HoMediaTestSub mediaView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.addMediaTest", mediaView);
	}
	
	
	public HoBloodTestSub bloodTestView(String hoTestRequestCode) {
		
		return sqlSession.selectOne("hoTest.viewBlood", hoTestRequestCode);
	}
	
	public int hoBloodTestAdd(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.addBlood", bloodView);
	}

	//검사요청 등록
	public int addTestRequest(Map<String , String > map) {
		// TODO Auto-generated method stub
		System.out.println("검사요청등록DAO");
		return sqlSession.insert("hoTest.addTestRequest", map);
	}

	public int addBlood(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.addBlood", bloodView);
	}
}
