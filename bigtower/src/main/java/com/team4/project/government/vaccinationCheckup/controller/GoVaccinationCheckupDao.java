package com.team4.project.government.vaccinationCheckup.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@Repository
public class GoVaccinationCheckupDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String VACCINATIONCHECKUP_NS = "GoVaccinationCheckup.";
	//예방접종 목록 가져오기
	public List<GoVaccinationResult> vaccinationList(){
		return sqlSession.selectList(VACCINATIONCHECKUP_NS+"vaccinationList");
	}
	//
	public List<GoCheckup> checkUpList(GoCheckup gocheckup){
		return sqlSession.selectList(VACCINATIONCHECKUP_NS+"checkUpList", gocheckup);
	}
}
