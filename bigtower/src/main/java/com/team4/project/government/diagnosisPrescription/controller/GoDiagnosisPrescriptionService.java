package com.team4.project.government.diagnosisPrescription.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.diagnosisPrescription.domain.GoPrescription;

@Service
public class GoDiagnosisPrescriptionService {

	@Autowired
	private GoDiagnosisPrescriptionDao goDPDao;

	// 진료코드로 진단결과 가져오기
	public List<GoDiagnosis> getListDiagnosisByTreatCode(String treatCode){
		return goDPDao.selectListDiagnosisByTreatCode(treatCode);
	}
	
	// 진료코드로 진단결과 가져오기
	public List<GoPrescription> getListPrescriptionByTreatCode(String treatCode){
		return goDPDao.selectListPrescriptionByTreatCode(treatCode);
	}
	
	
}
