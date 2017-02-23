package com.team4.project.government.treat.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.treat.domain.GoSearchTreatSub;

@Repository
public class GoTreatDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//진료 상세보기
	public GoSearchTreatSub goSelectTreat(String goTreatCode){
		return sqlSession.selectOne("GoTreat.selectTreat", goTreatCode);
	}
	
	//진료목록
	public List<GoSearchTreatSub> goTreatList(Map<String, Object> returnMap){
		System.out.println("TreatDao -->"+returnMap);
		return sqlSession.selectList("GoTreat.treatList", returnMap);
	}
	
	//동일한 진료코드의 질병코드 리스트 가져오기
	public List<GoDiagnosis> goDiagnosisList(String goTreatCode){
		return sqlSession.selectList("GoTreat.diagnosisList", goTreatCode);
	}
	
	//로그인된 국민의 진료본 과목 목록 출력하기
	public List<GoSearchTreatSub> goSelectOneTreatSubject(int goCitizenNo){
		return sqlSession.selectList("GoTreat.selectOneTreatSubject", goCitizenNo);
	}
}
