package com.team4.project.hospital.diagnosisPrescription.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.dto.HoMedicine;

@Transactional
@Service
public class HoDiagnosisPrescriptionService {

	@Autowired
	private HoDiagnosisPrescriptionDao hoDPD;
	
	//진단(질병명) 등록
	public int addDiagnosis(Map<String, Object> map){
		int result = 0;
		String[] diseaseList = (String[]) map.get("diseaseList");
		for(int i=0;i<diseaseList.length-1;i++){
			String hoDiseaseCode = diseaseList[i];
			System.out.println((i+1)+"번째 질병코드 : "+hoDiseaseCode);
			map.put("hoDiseaseCode", hoDiseaseCode);
			result = hoDPD.addDiagnosis(map);
			System.out.println(i+"번째 결과 : " + result);
		}
		return result;
	}
	
	//약 목록 가져오기
	public List<HoMedicine> selectMedicine(){
		return hoDPD.selectMedicine();
	}
	
	//처방전 등록
	public int addPrescription(HoPrescription hoPrescription){
		return hoDPD.addPrescription(hoPrescription);
	}
}
