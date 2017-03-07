package com.team4.project.hospital.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team4.project.hospital.dto.HoLoginCheckStaffSub;
import com.team4.project.hospital.dto.HoPatient;

@Transactional
@Service
public class HospitalService {
	@Autowired
	private HospitalDao hoDao;
	
	//로그인 처리
	public HoLoginCheckStaffSub loginCheck(String hoStaffId, String hoStaffPw){
		Map<String, String> map = new HashMap<String, String>();
		map.put("hoStaffId", hoStaffId);
		map.put("hoStaffPw", hoStaffPw);
		return hoDao.loginCheck(map);
	}
	
	//환자등록
	public int addPatient(HoPatient hoPatient){	
		//주민등록 중복여부 확인
		Map<String, Object> map = new HashMap<String, Object>();
		String hoCitzienId = hoPatient.getHoCitizenId();
		String hoHospitalCode = hoPatient.getHoHospitalCode();
		map.put("hoCitzienId", hoCitzienId);
		map.put("hoHospitalCode", hoHospitalCode);
		String checkCitizenId = hoDao.checkCitizenId(map);
		int result = 0;
		//중복여부에 따른 분기문
		if(checkCitizenId!=null){
			result = hoDao.addPatient(hoPatient);
		}else{
			System.out.println("=========주민번호 중복으로 인해 환자등록이 불가능합니다============");
		}
		
		return result;
	}
	
	
}
