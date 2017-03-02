package com.team4.project.hospital.treatChart.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;

@Repository
public class HoTreatChartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//차트생성
	public int addChart(HoChart hoChart){
		return sqlSession.insert("hoTreatChart.addChart", hoChart);
	}
	
	//진료 상세보기
	public HoTreatSub treatView(String hoTreatmentCode){
		return sqlSession.selectOne("hoTreatChart.treatView", hoTreatmentCode);
	}

	//진료목록
	public List<HoTreatSub> treatLsit(String hospitalCode) {
		return sqlSession.selectList("hoTreatChart.treatmentList", hospitalCode);
	}
	
	//검사 이름 가져오기
	public List<HoTest> selectTest() {
		return sqlSession.selectList("hoTreatChart.selectTest");
	}
}
