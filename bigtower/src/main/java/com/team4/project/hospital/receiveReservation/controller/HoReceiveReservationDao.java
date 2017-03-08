package com.team4.project.hospital.receiveReservation.controller;

import java.util.List;
import java.util.Map;

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
	public HoPatient selectOnePatient(Map map){
		return sqlSession.selectOne("hoReceiveReservation.selectPatient", map);
	}

	//한명의 환자 접수
	public int insertOneReceive(HoPatient hoPatient){	
		return 0;
	}
	
	//초진, 재진 조회
	public HoPatient searchTest(HoPatient hp) {	
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
	
	//접수 목록
	public List<HoReceiveSub> receiveList(String hospitalCode) {		
		return sqlSession.selectList("hoReceiveReservation.ReceiveList", hospitalCode);
	}
	
	//접수 상태에서 진료로 업데이트 map로 변수 선언
	public int receiveStateDiagnosis(String hoReceiveCode) {
		return sqlSession.update("hoReceiveReservation.receiveStateDiagnosis", hoReceiveCode);
	}
	
	//진료상태에서 수납대기로 변경
	public int receiveStatePay(String hoReceiveCode) {
		System.out.println("진료상태에서 수납대기로 변경 : "+hoReceiveCode);
		return sqlSession.update("hoReceiveReservation.receiveStateAcceptance", hoReceiveCode);
	}
	
	//수납대기에서 수납완료로 변경
	public List<HoReceiveSub> diagonesLList(String hospitalCode) {		
		return sqlSession.selectList("hoReceiveReservation.diagonesLList", hospitalCode);
	}
	//수납목록 출력
	public List<HoReceiveSub> payList(String hospitalCode) {		
		return sqlSession.selectList("hoReceiveReservation.payList", hospitalCode);
	}
	//수납대기 -> 수납완료 변경 
	public int payComplete(String hoReceiveCode) {
		// TODO Auto-generated method stub
		return sqlSession.update("hoReceiveReservation.payComplete", hoReceiveCode);
	}
	
}
