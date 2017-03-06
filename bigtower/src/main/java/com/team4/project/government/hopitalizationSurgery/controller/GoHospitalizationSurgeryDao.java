package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchHospitalizationSub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchSurgerySub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgeryResult;

@Repository
public class GoHospitalizationSurgeryDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	// 한진료의 수술결과
	public GoSurgeryResult selectOneSurgeryByTreatCode(String treatCode){
		return sql.selectOne("GoHospitalizationSurgery.getOneSurgeryByTreatCode", treatCode);
	}
	
	// 한진료의 수술결과
	public GoHospitalization selectOneHospitalizationByTreatCode(String treatCode){
		return sql.selectOne("GoHospitalizationSurgery.getOneHospitalizationByTreatCode", treatCode);
	}
	
	// 국민한명의 수술결과 리스트
	public List<GoSurgeryResult> selectListSurgeryByCitizenId(String citizenId){
		return sql.selectList("GoHospitalizationSurgery.getListSurgeryByCitizenId", citizenId);
	}
	
	// 국민한명의 입퇴원결과 리스트
	public List<GoHospitalization> selectListHospitalizationByCitizenId(String citizenId){
		return sql.selectList("GoHospitalizationSurgery.getListHospitalizationByCitizenId", citizenId);
	}
	
	// 의사한명의 수술결과 리스트
	public List<GoSurgeryResult> selectListSurgeryByDoctorId(String doctorId){
		return sql.selectList("GoHospitalizationSurgery.getListSurgeryByDoctorId", doctorId);
	}
	
	
	
	
	
	
	
	public List<GoSearchSurgerySub> goSurgeryList(Map<String, Object> returnMap) {
		
		System.out.println("goSurgeryList Dao : "+returnMap);
		return sql.selectList("GoHospitalizationSurgery.goSurgeryList", returnMap);
	}
	//입,퇴원 목록 출력
	public List<GoSearchHospitalizationSub> goHospitalizationList(Map<String, Object> returnMap) {
		// TODO Auto-generated method stub
		System.out.println("goHospitalizationList Dao : "+returnMap);
		return sql.selectList("GoHospitalizationSurgery.goHospitalizationList", returnMap);
	}
	//입,퇴원코드를 통해서 검색하여 질병 통합
	public List<GoDiagnosis> goDiagnosis(String goTreatCode) {
		// TODO Auto-generated method stub
		return sql.selectList("GoHospitalizationSurgery.goDiagnosis", goTreatCode);
	}
	public List<GoSearchSurgerySub> goSurgeryStatistics(int citizen) {
		// TODO Auto-generated method stub
		return sql.selectList("GoHospitalizationSurgery.goSurgeryStatistics", citizen);
	}
	public List<GoSearchHospitalizationSub> hospitalizationStatistics(int citizen) {
		// TODO Auto-generated method stub
		return sql.selectList("GoHospitalizationSurgery.hospitalizationStatistics", citizen);
	}
}
