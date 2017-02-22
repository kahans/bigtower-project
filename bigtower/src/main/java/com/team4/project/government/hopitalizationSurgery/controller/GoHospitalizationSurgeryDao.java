package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgery;

@Repository
public class GoHospitalizationSurgeryDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<GoSurgery> goSurgeryList(Map<String, Object> returnMap) {
		
		
		return sqlSession.selectList("GoHospitalizationSurgery.goSurgeryList", returnMap);
	}

	public List<GoHospitalization> goHospitalizationList(Map<String, Object> returnMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("GoHospitalizationSurgery.goHospitalizationList", returnMap);
	}
	//입,퇴원코드를 통해서 검색하여 질병 통합
	public List<GoDiagnosis> goDiagnosis(String goTreatCode) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("GoHospitalizationSurgery.goDiagnosis", goTreatCode);
	}
}
