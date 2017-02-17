package com.team4.project.government.vaccinationCheckup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@Service
public class GoVaccinationCheckupService {

	@Autowired
	private GoVaccinationCheckupDao goVCD;
	
	public List<GoVaccinationResult> vaccinationList(){
		return goVCD.vaccinationList();
	}
}
