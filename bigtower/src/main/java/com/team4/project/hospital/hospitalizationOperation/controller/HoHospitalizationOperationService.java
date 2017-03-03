package com.team4.project.hospital.hospitalizationOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;

@Service
public class HoHospitalizationOperationService {

	@Autowired
	private HoHospitalizationOperationDao hoHOD;
	
	//입퇴원 요청 등록
	public int addRequest(HoHospitalization hoHospitalization){
		return hoHOD.addRequest(hoHospitalization);
	}
}
