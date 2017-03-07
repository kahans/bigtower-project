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
	//영상검사 목록
	public List<HoTestRequestSub> mediaList(HoTestRequestSub hmt) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("hoTest.listHoTest", hmt);
	}
	//혈액검사 목록
	public List<HoTestRequestSub> bloodTestList(HoTestRequestSub hoTestRequest) {
		System.out.println(hoTestRequest);
		return sqlSession.selectList("hoTest.listHoTest", hoTestRequest);
	}
	//영상글 
	public HoMediaTestSub mediaTestView(String hoTestRequestCode) {
		System.out.println("DAO "+hoTestRequestCode);
		return sqlSession.selectOne("hoTest.addMediaTestView", hoTestRequestCode);
	}
	//혈액글 
	public HoBloodTestSub bloodTestView(String hoTestRequestCode) {
		
		return sqlSession.selectOne("hoTest.viewBlood", hoTestRequestCode);
	}
	//영상 검사 엡데이트
	public int updateMediaTest(HoMediaTestSub mediaView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.updateMedia", mediaView);
	}
	
	//혈액 검사 업데이트
	public int updateBloodTest(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.updateBlood", bloodView);
	}
	
	
	//검사요청 등록
	public int addTestRequest(Map<String , String > map) {
		// TODO Auto-generated method stub
		System.out.println("검사요청등록DAO");
		return sqlSession.insert("hoTest.addTestRequest", map);
	}
	//혈액검사 등록
	public int addBlood(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.addBlood", bloodView);
	}
	//영상검사 등록 
	public int addMedia(HoMediaTestSub mediaView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("hoTest.addMedia", mediaView);
	}
	//검사대기상테에서 결과대기상태로 상태 코드를 업데이트
	public int updateState(HoTestRequestSub hoTestRequest) {
		// TODO Auto-generated method stub
		return sqlSession.update("hoTest.updateState", hoTestRequest);
	}
	//결과대기상태에서 결과등록 완료로 상태가 변경
	public int updateBloodTestRequest(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		return sqlSession.update("hoTest.updateBloodTestRequest",bloodView);
	}
	public int updateMediaTestRequest(HoMediaTestSub mediaView) {
		// TODO Auto-generated method stub
		return sqlSession.update("hoTest.updateMediaTestRequest",mediaView);
	}
}
