package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.List;

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
	
	public List<GoSurgery> goSurgeryList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("GoHospitalizationSurgery.SurgeryList");
	}

	public List<GoHospitalization> goHospitalizationList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("GoHospitalizationSurgery.goHospitalizationList");
	}
	//입,퇴원코드를 통해서 검색하여 질병 통합
	public List<GoDiagnosis> goDiagnosis(String goTreatCode) {
		// TODO Auto-generated method stub
		System.out.println("dao : "+goTreatCode);
		return sqlSession.selectList("GoHospitalizationSurgery.goDiagnosis", goTreatCode);
	}
}
