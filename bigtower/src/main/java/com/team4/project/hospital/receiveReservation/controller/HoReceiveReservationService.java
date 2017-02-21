package com.team4.project.hospital.receiveReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.dto.HoPatient;

@Service
public class HoReceiveReservationService {

	@Autowired
	private HoReceiveReservationDao hoRRDao;
	
	//
	public HoPatient searchPatient(String goCitizenId){
		System.out.println("HoReceiveReservationService :"+goCitizenId);
		return hoRRDao.selectPatient(goCitizenId);
		
	}
	
}
