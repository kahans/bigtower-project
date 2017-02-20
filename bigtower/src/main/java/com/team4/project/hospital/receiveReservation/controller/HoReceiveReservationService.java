package com.team4.project.hospital.receiveReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.dto.HoPatient;

@Service
public class HoReceiveReservationService {

	@Autowired
	private HoReceiveReservationDao hoRRD;
	
	//환자조회
	public HoPatient selectPatient(String hoPatientCode){
		System.out.println("HoReceiveReservationService :"+hoPatientCode);
		return hoRRD.selectPatient(hoPatientCode);
		
	}
	
}
