package com.team4.project.government.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.team4.project.HomeController;
import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;
import com.team4.project.government.dto.GoMedicine;
import com.team4.project.hospital.dto.HoDisease;
import com.team4.project.hospital.dto.HoMedicine;
import com.team4.project.hospital.dto.HoOperationType;
import com.team4.project.hospital.dto.HoTreatSubject;
import com.team4.project.hospital.dto.HoVaccineType;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;
import com.team4.project.util.ContextParam;
import com.team4.project.util.GetReferenceData;
import com.team4.project.util.Http;
import com.team4.project.util.HttpUrlCon;

@Controller
public class GovernmentController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private GovernmentService goService;
	private Gson gson = new Gson();
	
	//url test
	@RequestMapping(value="/government/test2", method=RequestMethod.POST)
	public String test2(String hospitalInfo, String test){
		System.out.println("hospitalInfo:"+hospitalInfo);
		System.out.println("test:"+test);
		return "home";
	}
	
	//Context param test
	@RequestMapping(value="/government/test", method=RequestMethod.GET)
	public String test1(){
		String test = ContextParam.context.getInitParameter("test");
		System.out.println("test:"+test);
		return "home";
	}
	
	// 정부 db에서 주민번호 조회
	@RequestMapping(value="/government/checkCitizenId", method=RequestMethod.POST)
	public @ResponseBody String citizenIdCheck(String citizenId, HttpSession session){
		logger.debug("citizenId : " + citizenId);
		String checkResult = "";
		// doctorId는 세션에서 받아야함
		String doctorId = (String) session.getAttribute("DOCTORID");
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/checkCitizenId");
		Map<String, String> map = new HashMap<String,String>();
		map.put("citizenId", citizenId);
		map.put("doctorId", doctorId);
		try {
			// 리턴결과가 true이면 사용가능한 주민번호(정부db에 등록된 주민번호)
			// 리턴결과가 false이면 사용불가능한 주민번호(정부db에 등록되지 않은 주민번호)
			checkResult = conn.HttpUrlPOST(map);
			logger.debug("checkResult:"+checkResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("try절 이후에 checkResult값 : "+checkResult);
		return checkResult;
	}
	
	// httpPost를이용해 정부에서 코드값들 가져오는 메서드 테스트
	@RequestMapping(value="/government/getData", method=RequestMethod.GET)
	public String getData(){
		String doctorId = "";
		//List<HoMedicine> list1 = GetReferenceData.getMedicineCode(doctorId);
		//System.out.println("list1"+list1);
		//List<HoDisease> list2 = GetReferenceData.getDiseaseCode(doctorId);
		//System.out.println("list2"+list2);
		//List<HoOperationType> list3 = GetReferenceData.getSurgeryCode(doctorId);
		//System.out.println("list3"+list3);
		//List<HoTreatSubject> list4 = GetReferenceData.getTreatSubjectCode(doctorId);
		//System.out.println("list4"+list4);
		List<HoVaccineType> list5 = GetReferenceData.getVaccinationCode(doctorId);
		System.out.println("list5"+list5);
		
		return "home";
	}
	
	//초기화면 보여주기
	@RequestMapping(value="/government/", method=RequestMethod.GET)
	public String index(HttpSession session, Model model){
		logger.debug("index 메서드 호출");
		return "/hospital/views/government/gov_index";
	}

}
