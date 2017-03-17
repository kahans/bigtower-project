package com.team4.project.hospital.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.team4.project.hospital.dto.HoLoginCheckStaffSub;
import com.team4.project.hospital.dto.HoPatient;
import com.team4.project.hospital.dto.HoStatistics;
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;

@Transactional
@Service
public class HospitalService {
	private static final Logger logger = LoggerFactory.getLogger(HospitalService.class);
	Gson gson = new Gson();
	@Autowired
	private HospitalDao hoDao;
	
	//로그인 처리
	public HoLoginCheckStaffSub loginCheck(String hoStaffId, String hoStaffPw){
		Map<String, String> map = new HashMap<String, String>();
		map.put("hoStaffId", hoStaffId);
		map.put("hoStaffPw", hoStaffPw);
		return hoDao.loginCheck(map);
	}
	
	//환자등록
	public int addPatient(HoPatient hoPatient){	
		//주민등록 중복여부 확인
		Map<String, Object> map = new HashMap<String, Object>();
		String hoCitzienId = hoPatient.getHoCitizenId();
		String hoHospitalCode = hoPatient.getHoHospitalCode();
		map.put("hoCitzienId", hoCitzienId);
		map.put("hoHospitalCode", hoHospitalCode);
		System.out.println("병원 체크: "+hoHospitalCode);
		String checkCitizenId = hoDao.checkCitizenId(map);
		System.out.println("중복체크"+checkCitizenId);
		int result = 0;
		//중복여부에 따른 분기문
		if(checkCitizenId!=null){
			System.out.println("=========주민번호 중복으로 인해 환자등록이 불가능합니다============");
		}else{
			result = hoDao.addPatient(hoPatient);
			
		}
		
		return result;
	}
	//통계자료 규합
	public Map<String,Object> statistics(String hoHospitalCode, String disease, String medicine){
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		map.put("hoHospitalCode", hoHospitalCode);
		
		map.put("number", 1);
		//일일별 방문객수 조회
		int dayVisitPeople = hoDao.dayVisitCitizenCount(map);
		logger.debug("일일 방문객수 : "+dayVisitPeople);
		
		//일주일별 방문객수 조회		
		int monthVisitPeople = hoDao.monthVisitCitizenCount(map);
		logger.debug("일주일간 방문객수 : "+monthVisitPeople);
		
		//일년간 방문객수 조회
		int yearVisitPeople = hoDao.yearVisitCitizenCount(map);
		logger.debug("일년간 방문객수 : "+yearVisitPeople);
		
		//하루 진료과별 방문진료자 수
		List<HoStatistics> dayTreatVisit = hoDao.dayVisitTreatSubjectCitizenCount(map);
		for(int i=0; i<dayTreatVisit.size(); i++){
			logger.debug("일주일간 진료과별 방문진료자 수 : "+dayTreatVisit.toString());
		}
		
		//한달간 진료과별 방문진료자 수
		List<HoStatistics> monthTreatVisit = hoDao.monthVisitTreatSubjectCitizenCount(map);
		for(int i=0; i<monthTreatVisit.size(); i++){
			logger.debug("한달간 진료과별 방문진료자 수 : "+monthTreatVisit.toString());
		}
		
		//일년간 진료과별 방문진료자 수
		List<HoStatistics> yearTreatVisit = hoDao.yearVisitTreatSubjectCitizenCount(map);
		for(int i=0; i<yearTreatVisit.size(); i++){
			logger.debug("일년간 진료과별 방문진료자 수 : "+yearTreatVisit.toString());
		}
		
		//질병명은 정부에서 조회해서 비교해 넣어줘야함
		List<Map> diseaseInfo = gson.fromJson(disease, new TypeToken<List<Map>>(){}.getType());
		logger.debug("diseaseInfo 확인 : "+diseaseInfo);
		//일주일간 질병등록
		//logger.debug("111 여기 들어오냐");
		List<HoStatistics> weekDisease = hoDao.weekDiseaseCodeRanking(map);
		
		logger.debug("1. weekDisease 확인 : "+weekDisease.toString());
		for(int i=0; i<weekDisease.size(); i++){
			for(int j=0; j<diseaseInfo.size();j++){
				if(weekDisease.get(i).getHoDiseaseCode().equals((String)diseaseInfo.get(j).get("goDiseaseCode"))){
					logger.debug("질병코드 확인 : "+weekDisease.get(i).getHoDiseaseCode());
					logger.debug("세팅될 질병명 확인 : "+diseaseInfo.get(j).get("goDiseaseKor"));
					weekDisease.get(i).setHoDiseaseName((String)diseaseInfo.get(j).get("goDiseaseKor"));
					logger.debug("세팅됬는지 확인 : "+weekDisease.get(i).getHoDiseaseName());
				}
			}
		}
		
		//한달간 질병등록
		List<HoStatistics> monthDisease = hoDao.monthDiseaseCodeRanking(map);
		for(int i=0; i<monthDisease.size(); i++){
			for(int j=0; j<diseaseInfo.size();j++){
				if(monthDisease.get(i).getHoDiseaseCode().equals((String)diseaseInfo.get(j).get("goDiseaseCode"))){
					logger.debug("질병코드 확인 : "+monthDisease.get(i).getHoDiseaseCode());
					logger.debug("세팅될 질병명 확인 : "+diseaseInfo.get(j).get("goDiseaseKor"));
					monthDisease.get(i).setHoDiseaseName((String)diseaseInfo.get(j).get("goDiseaseKor"));
					logger.debug("세팅됬는지 확인 : "+monthDisease.get(i).getHoDiseaseName());
				}
			}
		}
		
		//일년간 질병등록
		List<HoStatistics> yearDisease = hoDao.yearDiseaseCodeRanking(map);
		for(int i=0; i<yearDisease.size(); i++){
			for(int j=0; j<diseaseInfo.size();j++){
				if(yearDisease.get(i).getHoDiseaseCode().equals((String)diseaseInfo.get(j).get("goDiseaseCode"))){
					logger.debug("질병코드 확인 : "+yearDisease.get(i).getHoDiseaseCode());
					logger.debug("세팅될 질병명 확인 : "+diseaseInfo.get(j).get("goDiseaseKor"));
					yearDisease.get(i).setHoDiseaseName((String)diseaseInfo.get(j).get("goDiseaseKor"));
					logger.debug("세팅됬는지 확인 : "+yearDisease.get(i).getHoDiseaseName());
				}
			}
		}
		
		//의약품명은 정부에서 조회해서 비교해 넣어줘야함
		List<Map> medicineInfo = gson.fromJson(medicine, new TypeToken<List<Map>>(){}.getType());
		//일주일간 의약품명
		List<HoStatistics> weekMedicine = hoDao.weekMedicineCodeRanking(map);
		for(int i=0; i<weekMedicine.size(); i++){
			for(int j=0; j<medicineInfo.size(); j++){
				if(weekMedicine.get(i).getHoMedicineCode().equals((String)medicineInfo.get(j).get("goMedicineCode"))){
					logger.debug("약품코드 확인 :"+weekMedicine.get(i).getHoMedicineCode());
					logger.debug("세팅될 약품명 확인 : "+medicineInfo.get(j).get("goMedicineName"));
					weekMedicine.get(i).setHoMedicineName((String)medicineInfo.get(j).get("goMedicineName"));
					logger.debug("세팅확인 : "+weekMedicine.get(i).getHoMedicineName());
				}
			}
		}	
		
		//한달간 의약품명
		List<HoStatistics> monthMedicine = hoDao.monthMedicineCodeRanking(map);
		for(int i=0; i<monthMedicine.size(); i++){
			for(int j=0; j<medicineInfo.size(); j++){
				if(monthMedicine.get(i).getHoMedicineCode().equals((String)medicineInfo.get(j).get("goMedicineCode"))){
					logger.debug("약품코드 확인 :"+monthMedicine.get(i).getHoMedicineCode());
					logger.debug("세팅될 약품명 확인 : "+medicineInfo.get(j).get("goMedicineName"));
					monthMedicine.get(i).setHoMedicineName((String)medicineInfo.get(j).get("goMedicineName"));
					logger.debug("세팅확인 : "+monthMedicine.get(i).getHoMedicineName());
				}
			}
		}
		
		//일년간 의약품명
		List<HoStatistics> yearMedicine = hoDao.yearMedicineCodeRanking(map);
		for(int i=0; i<yearMedicine.size(); i++){
			for(int j=0; j<medicineInfo.size(); j++){
				if(yearMedicine.get(i).getHoMedicineCode().equals((String)medicineInfo.get(j).get("goMedicineCode"))){
					logger.debug("약품코드 확인 :"+yearMedicine.get(i).getHoMedicineCode());
					logger.debug("세팅될 약품명 확인 : "+medicineInfo.get(j).get("goMedicineName"));
					yearMedicine.get(i).setHoMedicineName((String)medicineInfo.get(j).get("goMedicineName"));
					logger.debug("세팅확인 : "+yearMedicine.get(i).getHoMedicineName());
				}
			}
		}
		
		// 정부에서 최근 몇일간 의 데이터 가져오기
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon secondHttpUrlcon = new HttpUrlCon(url+"/bigbang/government/getListDiagnosisByTopcount");
		String diagnosisStr = "";
		Map<String, String> inputMap = new HashMap<String, String>();
		
		List<Object> countryDiagnosisList = new ArrayList<Object>();
		try {
			inputMap.put("period", "7");
			diagnosisStr = secondHttpUrlcon.HttpUrlPOST(inputMap);
			logger.debug("diagnosisStr:"+diagnosisStr);
			List<Object> diagnosisWeekList = gson.fromJson(diagnosisStr, new TypeToken<List<Object>>(){}.getType());
			logger.debug("diagnosisWeekList:"+diagnosisWeekList);
			countryDiagnosisList.add(diagnosisWeekList);
			
			inputMap.put("period", "30");
			diagnosisStr = secondHttpUrlcon.HttpUrlPOST(inputMap);
			logger.debug("diagnosisStr:"+diagnosisStr);
			List<Object> diagnosisMonthList = gson.fromJson(diagnosisStr, new TypeToken<List<Object>>(){}.getType());
			logger.debug("diagnosisMonthList:"+diagnosisMonthList);
			countryDiagnosisList.add(diagnosisMonthList);
			
			inputMap.put("period", "365");
			diagnosisStr = secondHttpUrlcon.HttpUrlPOST(inputMap);
			logger.debug("diagnosisStr:"+diagnosisStr);
			List<Object> diagnosisYearList = gson.fromJson(diagnosisStr, new TypeToken<List<Object>>(){}.getType());
			logger.debug("diagnosisYearList:"+diagnosisYearList);
			countryDiagnosisList.add(diagnosisYearList);
			logger.debug("countryDiagnosisList:"+countryDiagnosisList);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String prescriptionStr = "";
		List<Object> countryPrescriptionList = new ArrayList<Object>();
		try {
			inputMap.put("period", "7");
			prescriptionStr = secondHttpUrlcon.HttpUrlPOST(inputMap);
			logger.debug("prescriptionStr:"+prescriptionStr);
			List<Object> prescriptionWeekList = gson.fromJson(prescriptionStr, new TypeToken<List<Object>>(){}.getType());
			logger.debug("prescriptionWeekList:"+prescriptionWeekList);
			countryPrescriptionList.add(prescriptionWeekList);

			inputMap.put("period", "30");
			prescriptionStr = secondHttpUrlcon.HttpUrlPOST(inputMap);
			logger.debug("prescriptionStr:"+prescriptionStr);
			List<Object> prescriptionMonthList = gson.fromJson(prescriptionStr, new TypeToken<List<Object>>(){}.getType());
			logger.debug("prescriptionMonthList:"+prescriptionMonthList);
			countryPrescriptionList.add(prescriptionMonthList);
			
			inputMap.put("period", "365");
			prescriptionStr = secondHttpUrlcon.HttpUrlPOST(inputMap);
			logger.debug("prescriptionStr:"+prescriptionStr);
			List<Object> prescriptionYearList = gson.fromJson(prescriptionStr, new TypeToken<List<Object>>(){}.getType());
			logger.debug("prescriptionYearList:"+prescriptionYearList);
			countryPrescriptionList.add(prescriptionYearList);
			logger.debug("countryPrescriptionList:"+countryPrescriptionList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		resultMap.put("dayVisitPeople", dayVisitPeople);
		resultMap.put("monthVisitPeople", monthVisitPeople);
		resultMap.put("yearVisitPeople", yearVisitPeople);
		resultMap.put("dayTreatVisit", dayTreatVisit);
		resultMap.put("monthTreatVisit", monthTreatVisit);
		resultMap.put("yearTreatVisit", yearTreatVisit);
		resultMap.put("weekDisease", weekDisease);
		resultMap.put("monthDisease", monthDisease);
		resultMap.put("yearDisease", yearDisease);
		resultMap.put("weekMedicine", weekMedicine);
		resultMap.put("monthMedicine", monthMedicine);
		resultMap.put("yearMedicine", yearMedicine);
		
		resultMap.put("countryDiagnosisList", countryDiagnosisList);
		resultMap.put("countryPrescriptionList", countryPrescriptionList);

		return resultMap;
	}
	
}
