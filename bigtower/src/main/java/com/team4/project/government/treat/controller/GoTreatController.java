package com.team4.project.government.treat.controller;

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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.team4.project.government.treat.domain.GoTreat;
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;

@Controller
public class GoTreatController {
	private static final Logger logger = LoggerFactory.getLogger(GoTreatController.class);
	private Gson gson = new Gson();
	
	@Autowired
	private GoTreatService goTCService;

	
	// 검색 폼
	@RequestMapping(value="/government/searchTreat", method=RequestMethod.GET)
	public String searchForm(){
		return "/hospital/views/government/treat/gov_serachTreatForm";
	}

	//주민번호로 진료리스트 돌아오는 GET요청 만들어야함
	
	
	
	// 한사람의 진료리스트
		@RequestMapping(value="/government/getListTreatByCitizenId", method=RequestMethod.GET,
						produces = "text/json; charset=UTF-8")
		public String getListTreatByCitizenId(String citizenId, HttpSession session,Model model) {
			String doctorId = (String) session.getAttribute("DOCTORID");
			logger.debug("goCitizenI:"+ citizenId);
			logger.debug("doctorId : "+doctorId);
			List<GoTreat> getTreatList = goTCService.getListTreatByCitizenId(citizenId,doctorId);
			logger.debug("getTreatList"+getTreatList);
			model.addAttribute("citizenId",citizenId);
			model.addAttribute("getTreatList",getTreatList);
			return "/hospital/views/government/treat/gov_searchTreatResult";
		}
	
	// 한명의 의사에게 진료받은 여러사람의 진료리스트
		@RequestMapping(value="/government/getListTreatByDoctorId", method=RequestMethod.POST,
						produces = "text/json; charset=UTF-8")
		public String getListTreatByDoctorId(HttpSession session, Model model) {
			String doctorId = (String) session.getAttribute("DOCTORID");
			logger.debug("doctorId:"+doctorId);
			List<GoTreat> getTreatList = goTCService.getListTreatByDoctorId(doctorId);
			
			logger.debug("getTreatList "+getTreatList);
			model.addAttribute("getTreatList",getTreatList);
			return "/hospital/views/government/treat/gov_searchTreatResultByDoctorId";
		}
	
	// 한사람의 하나의 진료정보
	@RequestMapping(value="/government/getOneTreatByTreatCode", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getOneTreatByTreatCode(String treatCode){
		logger.debug("진료코드 : "+treatCode);
		String goSearchTreatSub  = gson.toJson(goTCService.getOneTreat(treatCode));
		logger.debug(goSearchTreatSub);
		return goSearchTreatSub;
	}
	
/*	
	
	//로그인된 국민의 진료본 과목 목록 출력하기
	@RequestMapping(value="/government/treatList", method=RequestMethod.GET)
	public String treatSearch(HttpSession session, Model model){
		int goCitizenNo = (Integer) session.getAttribute("GOCITIZENNO");
		List<GoTreat> treatSubjectList = goTCService.goSelectOneTreatSubject(goCitizenNo);
		model.addAttribute("treatSubjectList",treatSubjectList);
		return "/government/citizen/treat/goTreatList";
	}
	*/
	
	
}
