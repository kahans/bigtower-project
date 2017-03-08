package com.team4.project.hospital.transport.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
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
import com.team4.project.util.ContextParam;
import com.team4.project.util.Http;
import com.team4.project.util.HttpUrlCon;

@Service
public class TransportService {
	private static final Logger logger = LoggerFactory.getLogger(TransportService.class);
	@Autowired
	private TransportDao transportDao;
	private Gson gson = new Gson();
	/*
		HoBloodTest
		HoChart
		HoCheckup
		HoDiagnosis
		HoHospitalization
		HoMediaTest
		HoOperation
		HoPrescription
		HoTreat
		HoVaccine
	*/
	public void getAll(String hospitalCode){
		logger.debug("getAll Service 진입");
		hospitalCode = "hospital_1";
		// http로 보낼때 db에 들어갈내용은 json String으로 변환
		// Map<String, Object>타입으로 각 조회결과를 담는데 조회결과가 없는것은 null로 담는다.
		// 파일은 파일이름 앞에 Blood, Checkup, Image붙여서 보내서 받은다음에 잘라서 해당폴더에 넣는다
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		// 차트 조회
		List<HoChart> hoChart = transportDao.selectListHoChart(hospitalCode);
		logger.debug("hoChart:"+hoChart);	//리스트가 비어있으면 map에 null을 넣어줌 아니면 list를 넣어줌
		if(hoChart.isEmpty()){
			logger.debug("hoChart.isEmpty!!!");
			map.put("hoChart", null);
		}else{
			map.put("hoChart", hoChart);
		}
		
		// 진료 조회
		List<HoTreat> hoTreat = transportDao.selectListHoTreat(hospitalCode);
		logger.debug("hoTreat:"+hoTreat);
		if(hoTreat.isEmpty()){
			logger.debug("hoTreat.isEmpty!!!");
			map.put("hoTreat", null);
		}else{
			map.put("hoTreat", hoTreat);
		}
		
		// 진단 조회
		List<HoDiagnosis> hoDiagnosis = transportDao.selectListHoDiagnosis(hospitalCode);
		logger.debug("hoDiagnosis:"+hoDiagnosis);
		if(hoDiagnosis.isEmpty()){
			logger.debug("hoDiagnosis.isEmpty!!!");
			map.put("hoDiagnosis", null);
		}else{
			map.put("hoDiagnosis", hoDiagnosis);
		}
		
		// 처방결과 조회
		List<HoPrescription> hoPrescription = transportDao.selectListHoPrescription(hospitalCode);
		logger.debug("hoPrescription:"+hoPrescription);
		if(hoPrescription.isEmpty()){
			logger.debug("hoPrescription.isEmpty!!!");
			map.put("hoPrescription", null);
		}else{
			map.put("hoPrescription", hoPrescription);
		}

		// 입퇴원 조회
		List<HoHospitalization> hoHospitalization = transportDao.selectListHoHospitalization(hospitalCode);
		logger.debug("hoHospitalization:"+hoHospitalization);
		if(hoHospitalization.isEmpty()){
			logger.debug("hoHospitalization.isEmpty!!!");
			map.put("hoHospitalization", null);
		}else{
			map.put("hoHospitalization", hoHospitalization);
		}
		
		// 수술결과 조회
		List<HoOperation> hoOperation = transportDao.selectListHoOperation(hospitalCode);
		logger.debug("hoOperation:"+hoOperation);
		if(hoOperation.isEmpty()){
			logger.debug("hoOperation.isEmpty!!!");
			map.put("hoOperation", null);
		}else{
			map.put("hoOperation", hoOperation);
		}
		
		// 예방접종 조회
		List<HoVaccine> hoVaccine = transportDao.selectListHoVaccine(hospitalCode);
		logger.debug("hoVaccine:"+hoVaccine);
		if(hoVaccine.isEmpty()){
			logger.debug("hoVaccine.isEmpty!!!");
			map.put("hoVaccine", null);
		}else{
			map.put("hoVaccine", hoVaccine);
		}
		
		// 혈액검사 결과 조회(파일)
		List<HoBloodTest> hoBloodTest = transportDao.selectListHoBloodTest(hospitalCode);
		logger.debug("hoBloodTest:"+hoBloodTest);
		if(hoBloodTest.isEmpty()){	
			logger.debug("hoBloodTest.isEmpty!!!");
			map.put("hoBloodTest", null);
		}else{	// list가 empty가 아니면 파일도 보내줘야 하므로 파일을 가져와서 map에 담는다
			/*for(int i = 0;i<hoBloodTest.size(); i++){
				String fileName = hoBloodTest.get(i).getHoBloodTestImageName();
				String filePath = hoBloodTest.get(i).getHoBloodTestImagePath();
				map.put("fileBlood/"+fileName, new File(filePath+"/"+fileName));
			}*/
			map.put("hoBloodTest", hoBloodTest);
		}

		// 건강검진 조회(파일)
		List<HoCheckup> hoCheckup = transportDao.selectListHoCheckup(hospitalCode);
		logger.debug("hoCheckup:"+hoCheckup);
		if(hoCheckup.isEmpty()){
			logger.debug("hoCheckup.isEmpty!!!");
			map.put("hoCheckup", null);
		}else{
			/*for(int i = 0;i<hoCheckup.size(); i++){
				String fileName = hoCheckup.get(i).getHoCheckUpResultName();
				String filePath = hoCheckup.get(i).getHoCheckUpResultPath();
				map.put("fileCheckup/"+fileName, new File(filePath+"/"+fileName));
			}*/
			map.put("hoCheckup", hoCheckup);
		}

		// 영상검사결과 조회(파일)
		List<HoMediaTest> hoMediaTest = transportDao.selectListHoMediaTest(hospitalCode);
		logger.debug("hoMediaTest:"+hoMediaTest);
		if(hoMediaTest.isEmpty()){
			logger.debug("hoMediaTest.isEmpty!!!");
			map.put("hoMediaTest", null);
		}else{
			/*for(int i = 0;i<hoMediaTest.size(); i++){
				String fileName = hoMediaTest.get(i).getHoMediaTestImageName();
				String filePath = hoMediaTest.get(i).getHoMediaTestImagePath();
				map.put("fileCheckup/"+fileName, new File(filePath+"/"+fileName));
			}*/
			map.put("hoMediaTest", hoMediaTest);
		}
		
		logger.debug("map:"+map);
		String url = ContextParam.context.getInitParameter("httpUrl");
		
		HttpUrlCon conn = new HttpUrlCon(url+"/project/government/getHospitalInfo");
		//Map<String, Object> map1 = new HashMap<String , Object>();
		Map<String, String> hospitalMap = new HashMap<String , String>();
		//리스트들을 담은 map을 json string타입으로 parsing
		String hospitalInfo = gson.toJson(map);
		logger.debug("hospitalInfo:"+hospitalInfo);
		hospitalMap.put("hospitalCode", hospitalCode);
		hospitalMap.put("hospitalInfo", hospitalInfo);
		//map1.put("id", "2번!!");
		//map1.put("name","이거는 되것지..원래되는거여,,ㅋㅋ");
		//map1.put("id", "3번!!");
		//map1.put("name","이거는 안되것지 스벌,ㅠㅠ");
		//map1.put("test", "최유민");
		//map1.put("hospitalInfo", hospitalInfo);
		//map1.put("file1", new File("d://a.png"));
		//map1.put("file2", new File("d://b.png"));
		try {
			//conn.HttpUrlFilePOST(map1);
			conn.HttpUrlPOST(hospitalMap);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		logger.debug("getAll Service 끝");
	}
}
