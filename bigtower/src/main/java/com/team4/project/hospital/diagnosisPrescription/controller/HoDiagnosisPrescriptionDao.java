package com.team4.project.hospital.diagnosisPrescription.controller;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.diagnosisPrescription.domain.HoDiagnosis;

@Repository
public class HoDiagnosisPrescriptionDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int addDiagnosis(Map<String, Object> map){
		return sqlSession.insert("hoDiagnosisPrescription.addDiagnosis",map);
	}
}
