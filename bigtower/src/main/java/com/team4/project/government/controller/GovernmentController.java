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
import com.team4.project.HomeController;
import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;
import com.team4.project.government.dto.GoMedicine;
import com.team4.project.util.ContextParam;
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
	@RequestMapping(value="/government/checkCitizenId", method=RequestMethod.GET)
	public String citizenIdCheck(){
		// doctorId는 세션에서 받아야함
		String doctorId = "doctor_1";
		// citizenId는 따로 받아야함
		String citizenId = "900101-10100001";
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/checkCitizenId");
		Map<String, String> map = new HashMap<String,String>();
		map.put("citizenId", citizenId);
		map.put("doctorId", doctorId);
		try {
			// 리턴결과가 true이면 사용가능한 주민번호(정부db에 등록된 주민번호)
			// 리턴결과가 false이면 사용불가능한 주민번호(정부db에 등록되지 않은 주민번호)
			String checkResult = conn.HttpUrlPOST(map);
			logger.debug("checkResult:"+checkResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	// httpPost로 medicineCode 받아오기 성공
	@RequestMapping(value="/government/getData", method=RequestMethod.GET)
	public String getData(HttpSession session){
		String url = ContextParam.context.getInitParameter("receiveUrl");
		String doctorId = (String) session.getAttribute("DOCTORID");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getMedicineCode");
		try {
			// doctorId를 맵에 담는다
			Map<String, String> map = new HashMap<String, String>();
			map.put("doctorId", doctorId);
			// 맵을 위 url로 전송하고 약 리스트를 리턴받는다
			String medicineCode = conn.HttpUrlPOST(map);
			System.out.println("medicineCode:"+medicineCode);
			// 리스트타입의 json을 java List 타입으로 parsing 한다 
			GoMedicine[] array = gson.fromJson(medicineCode, GoMedicine[].class);
			List<GoMedicine> list = Arrays.asList(array);
			System.out.println("list:"+list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "home";
	}
	
	//초기화면 보여주기
	@RequestMapping(value="/government/", method=RequestMethod.GET)
	public String index(HttpSession session, Model model){
		logger.debug("index 메서드 호출");
		return "/hospital/views/government/gov_index";
	}

}
