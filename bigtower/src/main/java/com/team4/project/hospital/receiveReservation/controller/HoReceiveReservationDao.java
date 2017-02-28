package com.team4.project.hospital.receiveReservation.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.dto.HoPatient;
import com.team4.project.hospital.dto.HoTreatSubject;
import com.team4.project.hospital.receiveReservation.domain.HoReceiveSub;

@Repository
public class HoReceiveReservationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//한명의 환자 조회
	public HoPatient selectOnePatient(String hoCitizenId){
		return sqlSession.selectOne("hoReceiveReservation.selectPatient", hoCitizenId);
	}

	//한명의 환자 접수
	public int insertOneReceive(HoPatient hoPatient){
		
		return 0;
	}
	//초진, 재진 조회
	public HoPatient searchTest(HoPatient hp) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("hoReceiveReservation.selectPatientTest", hp);
	}
	
	//진료과목 이름 불러오기
	public List<HoTreatSubject> selectTreatSubject(){
		return sqlSession.selectList("hoReceiveReservation.selectTreatSubject");
	}
	
	//접수등록
	public int addReceive(HoReceiveSub hoReceiveSub){
		return sqlSession.insert("hoReceiveReservation.addReceive",hoReceiveSub);
	}
}
