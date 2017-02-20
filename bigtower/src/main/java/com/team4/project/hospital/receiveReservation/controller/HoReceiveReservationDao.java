package com.team4.project.hospital.receiveReservation.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.dto.HoPatient;

@Repository
public class HoReceiveReservationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//환자조회
	public HoPatient selectPatient(String hoPatientCode){
		
		return sqlSession.selectOne("ho.selectPatient", hoPatientCode);
		
	}

	
}
