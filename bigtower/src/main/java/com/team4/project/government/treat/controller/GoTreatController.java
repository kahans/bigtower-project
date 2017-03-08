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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
		return "/hospital/views/government/gov_serachForm";
	}
	
	// 검색 결과
	@RequestMapping(value="/government/getSearchResult", method=RequestMethod.POST)
	public String getSearchResult(String citizenId, Model model){
		logger.debug("citizenId:"+citizenId);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListTreatByCitizenId");
		// 원래 세션에서 받아와야함
		String doctorId = "";
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		try {
			String list = conn.HttpUrlPOST(map);	//여기서 전송 해서 String으로 받아
			logger.debug("list:"+list);
			List<GoTreat> treatList = gson.fromJson(list, new TypeToken<List<GoTreat>>(){}.getType());
			logger.debug("list2:"+treatList);
			model.addAttribute("treatList", treatList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/hospital/views/government/gov_searchTreatResult";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 한사람의 하나의 진료정보(test)
	@RequestMapping(value="/government/getOneTreatByTreatCode", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getOneTreatByTreatCode(String treatCode, String test){
		logger.debug("진료코드 : "+treatCode);
		logger.debug(goTCService.getOneTreat(treatCode).toString());
		String goSearchTreatSub  = gson.toJson(goTCService.getOneTreat(treatCode));
		logger.debug(goSearchTreatSub);
		return goSearchTreatSub;
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
	
	// 한사람의 진료리스트(test)
	@RequestMapping(value="/government/getListTreatByCitizenId", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getListTreatByCitizenId(String citizenId, String test) {
		logger.debug("goCitizenI:"+ citizenId);
		List<GoTreat> goTreatList = goTCService.getListTreatByCitizenId(citizenId);
		String list = gson.toJson(goTreatList);
		logger.debug("list : "+ list);
		return list;
	}
	
	// 한사람의 진료리스트
	@RequestMapping(value="/government/getListTreatByCitizenId", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getListTreatByCitizenId(String citizenId) {
		logger.debug("goCitizenI:"+ citizenId);
		List<GoTreat> goTreatList = goTCService.getListTreatByCitizenId(citizenId);
		String goTreatListJson = gson.toJson(goTreatList);
		logger.debug("listJson : "+ goTreatListJson);
		return goTreatListJson;
	}
	

	// 한명의 의사에게 진료받은 여러사람의 진료리스트(test)
	@RequestMapping(value="/government/getListTreatByDoctorId", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getListTreatByDoctorId(String doctorId, String test) {
		logger.debug("doctorId:"+doctorId);
		List<GoTreat> goTreatList = goTCService.getListTreatByDoctorId(doctorId);
		String goTreatListJson = gson.toJson(goTreatList);
		logger.debug("listJson : "+ goTreatListJson);
		return goTreatListJson;
	}
	
	// 한명의 의사에게 진료받은 여러사람의 진료리스트
	@RequestMapping(value="/government/getListTreatByDoctorId", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getListTreatByDoctorId(String doctorId) {
		logger.debug("doctorId:"+doctorId);
		List<GoTreat> goTreatList = goTCService.getListTreatByDoctorId(doctorId);
		String goTreatListJson = gson.toJson(goTreatList);
		logger.debug("listJson : "+ goTreatListJson);
		return goTreatListJson;
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
