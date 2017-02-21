package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgery;

@Service
public class GoHospitalizationSurgeryService {

	@Autowired
	private GoHospitalizationSurgeryDao goHSD;
	
	public List<GoSurgery> goSurgeryList(){
		return goHSD.goSurgeryList();
	}
	public List<GoHospitalization> goHospitalizationList(){
		List<GoHospitalization> goHospitalization = goHSD.goHospitalizationList();
		for(int i=0; i<goHospitalization.size();i++){
			String goTreatCode = goHospitalization.get(i).getGoTreatCode();
			List<GoDiagnosis> diagnosisList =goHSD.goDiagnosis(goTreatCode);
			goHospitalization.get(i).setDiagnosisList(diagnosisList);
		}
		
		return goHospitalization;
	}
}
