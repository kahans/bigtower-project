package com.team4.project.government.treat.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.treat.domain.GoTreat;

@Repository
public class GoTreatDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// 한사람의 하나의 진료정보
	public GoTreat selectOneTreat(String treatCode){
		return sqlSession.selectOne("GoTreat.selectOneTreat", treatCode);
	}
	
	// 한사람의 진료리스트
	public List<GoTreat> selectListTreatByCitizenId(String citizenId){
		return sqlSession.selectList("GoTreat.selectListTreatByCitizenId", citizenId);
	}
	
	// 한명의 의사에게 진료받은 여러사람의 진료리스트
	public List<GoTreat> selectListTreatByDoctorId(String doctorId){
		return sqlSession.selectList("GoTreat.selectListTreatByDoctorId", doctorId);
	}
	
	
	
	
	
	
	
	
	
	
	/*
	//동일한 진료코드의 질병코드 리스트 가져오기
	public List<GoDiagnosis> goDiagnosisList(String goTreatCode){
		return sqlSession.selectList("GoTreat.diagnosisList", goTreatCode);
	}
	
	//로그인된 국민의 진료본 과목 목록 출력하기
	public List<GoGetTreatSub> goSelectOneTreatSubject(int goCitizenNo){
		return sqlSession.selectList("GoTreat.selectOneTreatSubject", goCitizenNo);
	}*/
}
