package com.team4.project.hospital.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.dto.HoLoginCheckStaffSub;

@Service
public class HospitalService {
	@Autowired
	private HospitalDao hoDao;
	
	public HoLoginCheckStaffSub loginCheck(String hoStaffId, String hoStaffPw){
		Map<String, String> map = new HashMap<String, String>();
		map.put("hoStaffId", hoStaffId);
		map.put("hoStaffPw", hoStaffPw);
		return hoDao.loginCheck(map);
	}
	
}
