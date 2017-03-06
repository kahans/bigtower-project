package com.team4.project.government.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;
import com.team4.project.government.dto.GoMedicine;

@Repository
public class GovernmentDao {
	@Autowired
	private SqlSessionTemplate sql;
	
	public void insertData(Map<String, String> map){
		sql.insert("government.hucTest", map);
	}
	
	//국민 로그인체크
	public GoCitizen loginCheck(GoCitizen goCitizen){
		return sql.selectOne("government.citizenLoginCheck", goCitizen); 
	}
	//병원 로그인체크
	public GoHospital loginCheck(GoHospital goHospital){
		return sql.selectOne("government.hospitalLoginCheck", goHospital); 
	}
	
	//약코드 가져오기
	public List<GoMedicine> selectMedicine(){
		return sql.selectList("government.selectMedicineList");
	}
}
