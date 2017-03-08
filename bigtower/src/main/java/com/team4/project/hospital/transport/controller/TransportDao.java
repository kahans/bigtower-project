package com.team4.project.hospital.transport.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.diagnosisPrescription.domain.HoDiagnosis;
import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.test.domain.HoBloodTest;
import com.team4.project.hospital.test.domain.HoMediaTest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

@Repository
public class TransportDao {
	private static final Logger logger = LoggerFactory.getLogger(TransportDao.class);
	@Autowired
	private SqlSessionTemplate sql;
	
	// 혈액검사 조회
	public List<HoBloodTest> selectListHoBloodTest(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoBloodTest", hospitalCode);
	}
	
	// 차트 조회
	public List<HoChart> selectListHoChart(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoChart",hospitalCode);
	}
	
	// 건강검진 조회
	public List<HoCheckup> selectListHoCheckup(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoCheckup", hospitalCode);
	}
	
	// 진단 조회
	public List<HoDiagnosis> selectListHoDiagnosis(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoDiagnosis",hospitalCode);
	}
	
	// 입퇴원결과 조회
	public List<HoHospitalization> selectListHoHospitalization(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoHospitalization",hospitalCode);
	}
	
	// 영상검사결과 조회
	public List<HoMediaTest> selectListHoMediaTest(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoMediaTest", hospitalCode);
	}
	
	// 수술결과 조회
	public List<HoOperation> selectListHoOperation(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoOperation",hospitalCode);
	}
	
	// 처방결과 조회
	public List<HoPrescription> selectListHoPrescription(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoPrescription", hospitalCode);
	}	
	
	// 진료 조회
	public List<HoTreat> selectListHoTreat(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoTreat",hospitalCode);
	}
	
	// 예방접종 조회
	public List<HoVaccine> selectListHoVaccine(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoVaccine", hospitalCode);
	}
}
