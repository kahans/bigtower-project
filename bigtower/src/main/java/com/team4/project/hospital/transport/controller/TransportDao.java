package com.team4.project.hospital.transport.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
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
	public List<Map> selectListHoBloodTest(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoBloodTest", hospitalCode);
	}
	
	// 차트 조회
	public List<Map> selectListHoChart(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoChart",hospitalCode);
	}
	
	// 건강검진 조회
	public List<Map> selectListHoCheckup(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoCheckup", hospitalCode);
	}
	
	// 진단 조회
	public List<Map> selectListHoDiagnosis(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoDiagnosis",hospitalCode);
	}
	
	// 입퇴원결과 조회
	public List<Map> selectListHoHospitalization(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoHospitalization",hospitalCode);
	}
	
	// 영상검사결과 조회
	public List<Map> selectListHoMediaTest(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoMediaTest", hospitalCode);
	}
	
	// 수술결과 조회
	public List<Map> selectListHoOperation(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoOperation",hospitalCode);
	}
	
	// 처방결과 조회
	public List<Map> selectListHoPrescription(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoPrescription", hospitalCode);
	}	
	
	// 진료 조회
	public List<Map> selectListHoTreat(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoTreat",hospitalCode);
	}
	
	// 예방접종 조회
	public List<Map> selectListHoVaccine(String hospitalCode){
		return sql.selectList("hoTransport.selectListHoVaccine", hospitalCode);
	}
	
	
	
	// 정부전송상태 수정
	// 차트 수정
	public int updateChartSendState(){
		return sql.update("hoTransport.updateChartSendState");
	}
	
	// 진료 수정
	public int updateTreatmentSendState(){
		return sql.update("hoTransport.updateTreatmentSendState");
	}
	
	// 진단 수정
	public int updateDiagnosisSendState(){
		return sql.update("hoTransport.updateDiagnosisSendState");
	}
	
	// 처방 수정
	public int updatePrescriptionSendState(){
		return sql.update("hoTransport.updatePrescriptionSendState");
	}
	
	// 입퇴원 수정
	public int updateHospitalizationSendState(){
		return sql.update("hoTransport.updateHospitalizationSendState");
	}
	
	// 수술 수정
	public int updateOperationSendState(){
		return sql.update("hoTransport.updateOperationSendState");
	}
	
	// 혈액검사 수정
	public int updateBloodTestSendState(){
		return sql.update("hoTransport.updateBloodTestSendState");
	}
	
	// 영상검사 수정
	public int updateMediaTestSendState(){
		return sql.update("hoTransport.updateMediaTestSendState");
	}
	
	// 건강검진 수정
	public int updateCheckupSendState(){
		return sql.update("hoTransport.updateCheckupSendState");
	}
	
	// 예방접종 수정
	public int updateVaccineSendState(){
		return sql.update("hoTransport.updateVaccineSendState");
	}
}
