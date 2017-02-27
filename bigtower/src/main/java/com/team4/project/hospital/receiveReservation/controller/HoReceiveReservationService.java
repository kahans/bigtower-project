package com.team4.project.hospital.receiveReservation.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.dto.HoPatient;
import com.team4.project.hospital.dto.HoTreatSubject;

@Service
public class HoReceiveReservationService {
	private static final Logger logger = LoggerFactory.getLogger(HoReceiveReservationService.class);

	@Autowired
	private HoReceiveReservationDao hoRRDao;
	
	//한명의 환자조회
	public HoPatient searchOnePatient(String hoCitizenId){
		logger.debug("hoCitizenId:"+hoCitizenId);
		return hoRRDao.selectOnePatient(hoCitizenId);
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
}
