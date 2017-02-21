package com.team4.project.hospital.receiveReservation.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.dto.HoPatient;

@Repository
public class HoReceiveReservationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//한명의 환자 조회
	public HoPatient selectOnePatient(String goCitizenId){
		return sqlSession.selectOne("hospital.selectPatient", goCitizenId);
	}

	//한명의 환자 접수
	public int insertOneReceive(HoPatient hoPatient){
		
		return 0;
	}
}
