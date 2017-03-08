package com.team4.project.hospital.treatChart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team4.project.hospital.diagnosisPrescription.controller.HoDiagnosisPrescriptionDao;
import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.dto.HoDisease;
import com.team4.project.hospital.dto.HoMedicine;
import com.team4.project.hospital.dto.HoOperationType;
import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.dto.HoVaccineType;
import com.team4.project.hospital.hospitalizationOperation.controller.HoHospitalizationOperationDao;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.receiveReservation.controller.HoReceiveReservationDao;
import com.team4.project.hospital.test.controller.HoTestDao;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;
import com.team4.project.hospital.vaccineCheckup.controller.HoVaccineCheckupDao;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

@Transactional
@Service
public class HoTreatChartService {

	@Autowired
	private HoTreatChartDao hoTCD;
	
	@Autowired
	private HoTestDao testDao;
	
	@Autowired
	private HoHospitalizationOperationDao hospitalizationOperationDao;
	
	@Autowired
	private HoDiagnosisPrescriptionDao diagnosisPrescriptionDao;
	
	@Autowired
	private HoVaccineCheckupDao vaccineCheckupDao;

	@Autowired
	private HoDiagnosisPrescriptionDao hoDPD;
	
	@Autowired
	private HoReceiveReservationDao hoRRDao;
		
	//차트생성
	public int addChart(HoChart hoChart){
		return hoTCD.addChart(hoChart);
	}
	
	//진료 상세보기
	public HoTreatSub treatView(String hoTreatmentCode){
		return hoTCD.treatView(hoTreatmentCode);
	}

	//진료 목록
	public List<HoTreatSub> treatList(String hospitalCode) {
		return hoTCD.treatLsit(hospitalCode);
	}
	
	//수술 이름 가져오기
	public List<HoOperationType> selectOperation() {
		return hoTCD.selectOperation();
	}
	
	//약 목록 가져오기
	public List<HoMedicine> selectMedicine(){
		return hoDPD.selectMedicine();
	}
		
	//검사 이름 가져오기
	public List<HoTest> selectTest() {
		return hoTCD.selectTest();
	}
	
	//질병 이름 가져오기
	public List<HoDisease> selectDisease() {
		return hoTCD.selectDisease();
	}
	
	//백신타입 이름 가져오기
	public List<HoVaccineType> selectVaccine() {
		return hoTCD.selectVaccine();
	}
	
	//환자코드에 맞는 차트코드 가져오기
	public String selectChartCode(Map<String, String> map){
		return hoTCD.selectChartCode(map);
	}
	
	//접수완료 클릭시 진료 데이터 생성
	public int addTreat(HoTreat hoTreat, String hoReceiveCode){
		int result = hoRRDao.receiveStateDiagnosis(hoReceiveCode);
		System.out.println("접수완료에서 진료로 상태업데이트 결과?" + result);
		return hoTCD.addTreat(hoTreat);
	}
	
	//진료 상세보기에서 진료업데이트
	public int updateTreat(Map<String, Object> map){
		//각각 DAO로 분기
		HoTreat hoTreat = (HoTreat) map.get("hoTreat");
		String hoTreatmentCode = hoTreat.getHoTreatmentCode();
		String checkHospitalization = (String) map.get("checkHospitalization");
		HoOperation hoOperation = (HoOperation) map.get("hoOperation");
		HoPrescription hoPrescription = (HoPrescription) map.get("hoPrescription");
		HoVaccine hoVaccine = (HoVaccine) map.get("hoVaccine");
		List<String> testList = (List<String>) map.get("testList");
		List<String> diseaseList = (List<String>) map.get("diseaseList");
		List<String> medicineList = (List<String>) map.get("medicineList");
		
		// 검사코드가 0이 아니면(검사요청을 선택했으면)
		if(testList!=null){
			Map<String, String> addTestReqeustMap = new HashMap<String, String>();
			addTestReqeustMap.put("hoTreatmentCode", hoTreatmentCode);
			for(int i=0;i<testList.size();i++){
				String hoTestCode = testList.get(i);
				addTestReqeustMap.put("hoTestCode", hoTestCode);
				int result = testDao.addTestRequest(addTestReqeustMap);
				System.out.println(result+"번째 검사요청 등록성공");
			}
		}
		// 입원요청이 있으면
		if(!checkHospitalization.equals("0")){
			int result = hospitalizationOperationDao.addRequest(hoTreatmentCode);
			if(result == 1){
				System.out.println("입원요청 등록성공");
			}		}
		// 수술요청이 있으면
		if(!hoOperation.getHoOperationTypeCode().equals("0")){
			int result = hospitalizationOperationDao.addOperation(hoOperation);
			if(result == 1){
				System.out.println("수술요청 등록성공");
			}
		}
		// 처방결과등록이 있으면
		if(!medicineList.get(0).equals("0")){
			int result = 0;
			for(int i=0; i<medicineList.size()-1;i++){
				hoPrescription.setHoMedicineCode(medicineList.get(i));
				result += diagnosisPrescriptionDao.addPrescription(hoPrescription);
			}
			if(result > 0 ){
				System.out.println("처방결과 "+ result +"회 등록성공");
			}
		}
		// 예방접종 등록이 있으면
		if(!hoVaccine.getHoVaccineTypeCode().equals("0")){
			int result = vaccineCheckupDao.addVaccine(hoVaccine);
			if(result == 1){
				System.out.println("예방접종 등록성공");
			}
		}
		hoRRDao.receiveStateAcceptance(hoTreatmentCode);
		return hoTCD.updateTreat(hoTreat);
	}
}
