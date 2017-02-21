package com.team4.project.government.treatChart.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.treatChart.domain.GoTreat;

@Repository
public class GoTreatChartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//진료 상세보기
	public GoTreat goSelectTreat(String goTreatCode){
		return sqlSession.selectOne("GoTreatChart.goSelectTreat", goTreatCode);
	}
	
	//진료목록
	public List<GoTreat> goTreatList(){
		return sqlSession.selectList("GoTreatChart.goTreatList");
	}
	
	//동일한 진료코드의 질병코드 리스트 가져오기
	public List<GoDiagnosis> goDiagnosisList(String goTreatCode){
		return sqlSession.selectList("GoTreatChart.goDiagnosisList", goTreatCode);
	}
}
