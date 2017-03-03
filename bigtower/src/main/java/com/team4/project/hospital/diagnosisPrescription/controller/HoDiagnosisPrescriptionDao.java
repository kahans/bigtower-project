package com.team4.project.hospital.diagnosisPrescription.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.dto.HoMedicine;

@Repository
public class HoDiagnosisPrescriptionDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//진단(질병명) 등록
	public int addDiagnosis(Map<String, Object> map){
		return sqlSession.insert("hoDiagnosisPrescription.addDiagnosis",map);
	}
	
	//약 목록 가져오기
	public List<HoMedicine> selectMedicine(){
		return sqlSession.selectList("hoDiagnosisPrescription.selectMedicine");
	}
	
	//처방전 등록
	public int addPrescription(HoPrescription hoPrescription){
		return sqlSession.insert("hoDiagnosisPrescription.addPrescription",hoPrescription);
	}
}
