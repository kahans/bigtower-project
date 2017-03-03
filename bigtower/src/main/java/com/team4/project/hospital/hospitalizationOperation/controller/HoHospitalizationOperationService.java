package com.team4.project.hospital.hospitalizationOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Service
public class HoHospitalizationOperationService {

	@Autowired
	private HoHospitalizationOperationDao hoHOD;
	
	//입퇴원 요청 등록
	public int addRequest(HoHospitalization hoHospitalization){
		return hoHOD.addRequest(hoHospitalization);
	}
	
	//수술 등록
	public int addOperation(HoOperation hoOperation){
		return hoHOD.addOperation(hoOperation);
	}
	
	//수술 목록
	public List<HoOperationSub> operationList(){
		return hoHOD.operationList();
	}
}
