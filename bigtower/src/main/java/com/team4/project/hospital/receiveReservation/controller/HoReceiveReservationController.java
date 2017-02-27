package com.team4.project.hospital.receiveReservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.project.hospital.dto.HoPatient;


@Controller
public class HoReceiveReservationController {
	private static final Logger logger = LoggerFactory.getLogger(HoReceiveReservationController.class);
	@Autowired
	private HoReceiveReservationService hoRRService;
	
	//접수폼 보여주기
	@RequestMapping(value="/hospital/receive", method=RequestMethod.GET)
	public String addOneReceive(Model model,
			@RequestParam(value="hoCitizenId", required=false)String hoCitizenId){
		model.addAttribute("hoCitizenId",hoCitizenId);
		logger.debug("addPatient GET");
		return "/hospital/views/receive";
	}
	
	//접수실행
	@RequestMapping(value="/hospital/receive", method=RequestMethod.POST)
	public String addOneReceive(HoPatient hoPatient){
		logger.debug("addReceive POST");
		logger.debug("hoReceive:"+hoPatient);
		
		return "/hospital/views/receive";
	}
	
	//ajax 한명의 환자정보 조회
	@RequestMapping(value="hospital/searchPatient", method=RequestMethod.POST)
	public @ResponseBody HoPatient searchOnePatient(@RequestParam("hoCitizenId")String hoCitizenId){
		logger.debug("searchOnePatient POST");
		HoPatient hopatient = hoRRService.searchOnePatient(hoCitizenId);
		logger.debug("hopatient:"+hopatient);
		
		return hopatient;
	}
	//초진, 재진 뷰 보기
	@RequestMapping(value="/hospital/searchPatientTest", method=RequestMethod.GET)
	public String searchOnePatientTest(){
		logger.debug("searchOnePatientTest GET 화면 불러오기");
		
		return "/hospital/views/searchPatient";
	}
	//초진, 재진 조회
	@RequestMapping(value="/hospital/searchPatientTest", method=RequestMethod.POST)
	public String searchOnePatientTest(HoPatient hp, Model model, RedirectAttributes redidredctAttributes,
										@RequestParam(value="idfirst", required=false) String idfirst,
										@RequestParam(value="idsecond", required=false) String idsecond
			){
		logger.debug("searchOnePatientTest POST 데이터 보내기");
		//뷰에서 받은 주민번호를 controller에서 처리를 한다.
		//앞,뒤로 받은 주민번호를 하나의 문자열로 합치고, DTO에 set으로 세팅한다.
		String se = idfirst+"-"+idsecond;
		System.out.println("주민번호 : "+se);
		hp.setHoCitizenId(se);
		
		//dto에 들어간 데이터를 확인
		System.out.println(hp.toString());
		
		hp = hoRRService.searchPatientTest(hp);
		System.out.println("mapper에서온 손님 : "+hp);
		if(hp!=null){//널이 아니면 접수등록으로 이동한다.
			String hoCitizenId = hp.getHoCitizenId();
			redidredctAttributes.addAttribute("hoCitizenId",hoCitizenId);
			return "redirect:/hospital/receive";
		}else{//초진을 경우 null로 되어 있는 경우 환자를 등록 뷰로 이동한다.
			return "/hospital/views/addPatient";
		}
		
		//return "/hospital/views/receive";
	}
}


