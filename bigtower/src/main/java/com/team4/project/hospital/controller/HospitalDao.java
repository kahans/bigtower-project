package com.team4.project.hospital.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.dto.HoLoginCheckStaffSub;
import com.team4.project.hospital.dto.HoPatient;

@Repository
public class HospitalDao {
	@Autowired
	private SqlSessionTemplate sql;
	
	//로그인 처리
	public HoLoginCheckStaffSub loginCheck(Map<String,String> map){
		return sql.selectOne("hospital.loginCheck",map);
	}
	
	//환자등록
	public int addPatient(HoPatient hoPatient){
		return sql.insert("hospital.addPatient", hoPatient);
	}
	
}
