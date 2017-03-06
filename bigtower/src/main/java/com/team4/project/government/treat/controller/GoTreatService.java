package com.team4.project.government.treat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.treat.domain.GoTreat;
import com.team4.project.util.Util;

@Service
public class GoTreatService {

	@Autowired
	private GoTreatDao goTCDao;
	
	// 한사람의 하나의 진료정보
	public GoTreat getOneTreat(String treatCode){
		return goTCDao.selectOneTreat(treatCode);
	}
		
	// 한사람의 진료리스트
	public List<GoTreat> getListTreatByCitizenId(String citizenId){
		return goTCDao.selectListTreatByCitizenId(citizenId);
	}
	
	// 한명의 의사에게 진료받은 여러사람의 진료리스트
	public List<GoTreat> getListTreatByDoctorId(String doctorId){
		return goTCDao.selectListTreatByDoctorId(doctorId);
	}
	
	
	
	
	
	
	
	
	
	
	/*
	//동일한 진료코드의 질병코드 리스트 가져오기
	public List<GoDiagnosis> goDiagnosisList(String goTreatCode){	
		return goTCDao.goDiagnosisList(goTreatCode);
	}
	
	//로그인된 국민의 진료본 과목 목록 출력하기
	public List<GoGetTreatSub> goSelectOneTreatSubject(int goCitizenNo){
		return goTCDao.goSelectOneTreatSubject(goCitizenNo);
	}*/
}
