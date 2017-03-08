package com.team4.project.hospital.receiveReservation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team4.project.hospital.dto.HoPatient;
import com.team4.project.hospital.dto.HoTreatSubject;
import com.team4.project.hospital.receiveReservation.domain.HoReceiveSub;

@Transactional
@Service
public class HoReceiveReservationService {
	private static final Logger logger = LoggerFactory.getLogger(HoReceiveReservationService.class);

	@Autowired
	private HoReceiveReservationDao hoRRDao;
	
	//한명의 환자조회
	public HoPatient searchOnePatient(String hoCitizenId, String hospitalCode){
		logger.debug("hoCitizenId:"+hoCitizenId);
		logger.debug("hospitalCode:"+hospitalCode);
		Map<String, String> map = new HashMap<String, String>();
		map.put("hoCitizenId", hoCitizenId);
		map.put("hoHospitalCode", hospitalCode);
		return hoRRDao.selectOnePatient(map);
	}
	
	//한명의 환자접수
	public int addOneReceive(HoPatient hoPatient){
				
		return 0;
	}
	
	//초진 , 재진 조회
	public HoPatient searchPatientTest(HoPatient hp){
		System.out.println("서비스 : "+hp.getHoCitizenId());
		return hoRRDao.searchTest(hp);
	}
	
	//진료과목 이름 불러오기
	public List<HoTreatSubject> selectTreatSubject(){
		return hoRRDao.selectTreatSubject();
	}
	
	//접수등록
	public int addReceive(HoReceiveSub hoReceiveSub){
		return hoRRDao.addReceive(hoReceiveSub);
	}
	//접수 목록
	public List<HoReceiveSub> receiveList(String hospitalCode) {
		// TODO Auto-generated method stub
		return hoRRDao.receiveList(hospitalCode);
	}
	//접수상태 진료로 전환
	public int receiveStateDiagnosis(String hoReceiveCode) {
		// TODO Auto-generated method stub
		return hoRRDao.receiveStateDiagnosis(hoReceiveCode);
	}
	//접수를 수납대기로 전환
	public int receiveStateAcceptance(String hoReceiveCode) {
		// TODO Auto-generated method stub
		return hoRRDao.receiveStateAcceptance(hoReceiveCode);
		
	}
	//진료목록
	public List<HoReceiveSub> diagnosisList(String hospitalCode) {
		// TODO Auto-generated method stub
		return hoRRDao.diagonesLList(hospitalCode);
	}
	//수납목록
	public List<HoReceiveSub> acceptanceList(String hospitalCode) {
		// TODO Auto-generated method stub
		return hoRRDao.acceptanceList(hospitalCode);
	}
}
