package com.team4.project.government.diagnosisPrescription.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.diagnosisPrescription.domain.GoPrescription;

@Repository
public class GoDiagnosisPrescriptionDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	// 진료코드로 진단결과 가져오기
	public List<GoDiagnosis> selectListDiagnosisByTreatCode(String treatCode){
		return sql.selectList("goDiagnosisPrescription.selectListDiagnosisByTreatCode", treatCode);
	}
	
	// 진료코드로 처방결과 가져오기
	public List<GoPrescription> selectListPrescriptionByTreatCode(String treatCode){
		return sql.selectList("goDiagnosisPrescription.selectListPrescriptionByTreatCode", treatCode);
	}
	
}
