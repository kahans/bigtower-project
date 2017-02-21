package com.team4.project.hospital.receiveReservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.dto.HoPatient;

@Service
public class HoReceiveReservationService {
	private static final Logger logger = LoggerFactory.getLogger(HoReceiveReservationService.class);

	@Autowired
	private HoReceiveReservationDao hoRRDao;
	
	//한명의 환자조회
	public HoPatient searchOnePatient(String goCitizenId){
		logger.debug("goCitizenId:"+goCitizenId);
		return hoRRDao.selectOnePatient(goCitizenId);
	}
	
	//한명의 환자접수
	public int addOneReceive(HoPatient hoPatient){
		if(hoRRDao.selectOnePatient(hoPatient.getGoCitizenId()) ==null) {
			
		}
		
		
		return 0;
	}
	
}
