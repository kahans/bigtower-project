package com.team4.project.government.vaccinationCheckup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@Service
public class GoVaccinationCheckupService {

	@Autowired
	private GoVaccinationCheckupDao goVCD;
	
	public List<GoVaccinationResult> vaccinationList(){
		return goVCD.vaccinationList();
	}
	//건강검진 결과 목록가져오기
	public List<GoCheckup> checkUpList(GoCheckup gocheckup){
		
		
		
		
		return goVCD.checkUpList(gocheckup);
	}
}
