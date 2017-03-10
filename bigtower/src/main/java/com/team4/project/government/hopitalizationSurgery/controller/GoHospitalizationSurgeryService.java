package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchHospitalizationSub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchSurgerySub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgeryResult;
import com.team4.project.government.test.controller.GoTestService;
import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;
import com.team4.project.util.Util;

@Service
public class GoHospitalizationSurgeryService {
	Gson gson = new Gson();
	private static final Logger logger = LoggerFactory.getLogger(GoHospitalizationSurgeryService.class);
	
	@Autowired
	private GoHospitalizationSurgeryDao goHSDao;

	
	// 한진료의 수술결과
	public GoSearchSurgerySub getOneSurgeryByTreatCode(String treatCode, String doctorId){
		return goHSDao.selectOneSurgeryByTreatCode(treatCode);
	}
	
	// 한진료의 입/퇴원결과
	public GoHospitalization getOneHospitalizationByTreatCode(String treatCode, String doctorId){
		return goHSDao.selectOneHospitalizationByTreatCode(treatCode);
	}
	
	// 국민한명의 수술결과 리스트
	public List<GoSurgeryResult> getListSurgeryByCitizenId(String citizenId, String doctorId){
		List<GoSurgeryResult> listSurgeryResult = new ArrayList<GoSurgeryResult>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListSurgeryResultByCitizenId");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listSurgeryResult = gson.fromJson(result, new TypeToken<List<GoSurgeryResult>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listSurgeryResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listSurgeryResult;
	}
	
	// 국민한명의 입퇴원결과 리스트
	public List<GoHospitalization> getListHospitalizationByCitizenId(String citizenId, String doctorId){
		List<GoHospitalization> listSurgeryResult = new ArrayList<GoHospitalization>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListHospitalizationByCitizenId");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listSurgeryResult = gson.fromJson(result, new TypeToken<List<GoHospitalization>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listSurgeryResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listSurgeryResult;
	}
	
	// 의사한명의 수술결과 리스트
	public List<GoSurgeryResult> getListSurgeryByDoctorId(String doctorId){
		return goHSDao.selectListSurgeryByDoctorId(doctorId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 수술내역 검색
	public List<GoSearchSurgerySub> goSurgeryList(Map<String, Object> returnMap) {
		// 컨트롤러에서 받은 returnMap에 있는 firstDate, secondDate를 꺼내 온다.
		String firstDate = (String) returnMap.get("firstDate");
		String secondDate = (String) returnMap.get("secondDate");
		String surgeryResult= (String) returnMap.get("searchContents");

		Map<String, Object> map = Util.createDate(firstDate, secondDate);

		secondDate = (String) map.get("secondDate");
		firstDate = (String) map.get("firstDate");
		
		if(!surgeryResult.equals("")){
			surgeryResult = "%"+surgeryResult+"%";
		}
		
		// 세팅된 변수를 다시 returnMap으로 담겨져야 한다.
		returnMap.put("searchContents", surgeryResult);
		returnMap.put("firstDate", firstDate);
		returnMap.put("secondDate", secondDate);
		
		List<GoSearchSurgerySub> goSurgeryList = goHSDao.goSurgeryList(returnMap);
		System.out.println("데이터가 왔는지 확인 : " + goSurgeryList.toString());
		
		return goSurgeryList;
	}

	// 입,퇴원 목록
	public List<GoSearchHospitalizationSub> goHospitalizationList(Map<String, Object> returnMap) {

		String secondDate = (String) returnMap.get("secondDate");
		String firstDate = (String) returnMap.get("firstDate");
		String hospitalName = (String) returnMap.get("searchContents");
		// secondDate와 firstDate 변수를 Util클래스내에 createDate메서드로 변수의 값을 보낸다.
		Map<String, Object> map = Util.createDate(firstDate, secondDate);
		String secondDate2 = (String) map.get("secondDate");// secondDate는 금일
															// 날짜를 가져온다.
		String firstDate02 = (String) map.get("firstDate");

		if (!hospitalName.equals("")) {// 쿼리문에 사용될 like문
			hospitalName = "%" + hospitalName + "%";
		}
		returnMap.put("searchContents", hospitalName);
		returnMap.put("secondDate", secondDate2);
		returnMap.put("firstDate", firstDate02);
		System.out.println("service에서 returnMap의 데이터 : " + returnMap);

		List<GoSearchHospitalizationSub> goHospitalization = goHSDao.goHospitalizationList(returnMap);
		// 질병을 갯수를 한 글에 출력
		for (int i = 0; i < goHospitalization.size(); i++) {
			String goTreatCode = goHospitalization.get(i).getGoTreatCode();
			List<GoDiagnosis> diagnosisList = goHSDao.goDiagnosis(goTreatCode);
			goHospitalization.get(i).setDiagnosisList(diagnosisList);
		}
		System.out.println(goHospitalization.toString());

		return goHospitalization;
	}

	public List<GoSearchSurgerySub> goSurgeryStatistics(int citizen) {
		System.out.println(citizen);
		// TODO Auto-generated method stub
		return goHSDao.goSurgeryStatistics(citizen);
	}

	public List<GoSearchHospitalizationSub> hospitalizationStatistics(int citizen) {
		// TODO Auto-generated method stub
		return goHSDao.hospitalizationStatistics(citizen);
	}
}
