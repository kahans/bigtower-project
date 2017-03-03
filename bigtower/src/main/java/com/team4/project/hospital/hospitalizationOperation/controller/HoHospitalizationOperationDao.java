package com.team4.project.hospital.hospitalizationOperation.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;

@Repository
public class HoHospitalizationOperationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//입퇴원 요청 등록
	public int addRequest(HoHospitalization hoHospitalization){
		return sqlSession.insert("hoHospitalizationOperation.addRequest",hoHospitalization);
	}
}
