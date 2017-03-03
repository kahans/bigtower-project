package com.team4.project.hospital.hospitalizationOperation.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Repository
public class HoHospitalizationOperationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//입퇴원 요청 등록
	public int addRequest(HoHospitalization hoHospitalization){
		return sqlSession.insert("hoHospitalizationOperation.addRequest",hoHospitalization);
	}
	
	//수술 등록
	public int addOperation(HoOperation hoOperation){
		return sqlSession.insert("hoHospitalizationOperation.addOperation",hoOperation);
	}
	
	//수술 목록
	public List<HoOperationSub> operationList(){
		return sqlSession.selectList("hoHospitalizationOperation.operationList");
	}
}
