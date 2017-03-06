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
		return hoDao.addPatient(hoPatient);
	}
}
