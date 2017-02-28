package com.team4.project.hospital.receiveReservation.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
import com.team4.project.hospital.dto.HoTreatSubject;
import com.team4.project.hospital.receiveReservation.domain.HoReceive;
import com.team4.project.hospital.receiveReservation.domain.HoReceiveSub;


@Controller
public class HoReceiveReservationController {
	private static final Logger logger = LoggerFactory.getLogger(HoReceiveReservationController.class);
	@Autowired
	private HoReceiveReservationService hoRRService;
	
	//접수폼 보여주기
	@RequestMapping(value="/hospital/receive", method=RequestMethod.GET)
	public String addOneReceive(Model model,
			@RequestParam(value="hoCitizenId", required=false)String hoCitizenId){
		List<HoTreatSubject> treatSubjectList = hoRRService.selectTreatSubject();
		System.out.println("treatSubjectList :" + treatSubjectList);
		model.addAttribute("hoCitizenId",hoCitizenId);
		model.addAttribute("treatSubjectList",treatSubjectList);
		logger.debug("addPatient GET");
		return "/hospital/views/receive";
	}
	
	//접수실행
	@RequestMapping(value="/hospital/receive", method=RequestMethod.POST)
	public String addOneReceive(HoReceiveSub hoReceiveSub, HttpSession session){
		logger.debug("addReceive POST");
		logger.debug("HoReceiveSub:"+ hoReceiveSub);
		
		//세션에서 병원코드, 직원ID, 직원권한을 가져옴
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		String hoStaffId = (String) session.getAttribute("HOSTAFFID");
		hoReceiveSub.setHoHospitalCode(hoHospitalCode);
		hoReceiveSub.setHoStaffId(hoStaffId);
		System.out.println("hoReceiveSub : "+ hoReceiveSub);
		hoRRService.addReceive(hoReceiveSub);
		return "redirect:/hospital/receiveList";
	}
	
	//ajax 한명의 환자정보 조회
	@RequestMapping(value="hospital/searchReceive", method=RequestMethod.POST)
	public @ResponseBody HoPatient searchOnePatient(@RequestParam("hoCitizenId")String hoCitizenId){
		logger.debug("searchOnePatient POST");
		HoPatient hopatient = hoRRService.searchOnePatient(hoCitizenId);
		logger.debug("hopatient:"+hopatient);
		
		return hopatient;
	}
	//초진, 재진 뷰 보기
	@RequestMapping(value="/hospital/searchPatient", method=RequestMethod.GET)
	public String searchOnePatientTest(){
		logger.debug("searchOnePatientTest GET 화면 불러오기");
		
		return "/hospital/views/searchPatient";
	}
	//초진, 재진 조회
	@RequestMapping(value="/hospital/searchPatient", method=RequestMethod.POST)
	public String searchOnePatientTest(HoPatient hp, Model model, RedirectAttributes redirectAttributes,
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
			redirectAttributes.addAttribute("hoCitizenId",hoCitizenId);
			return "redirect:/hospital/receive";
		}else{//초진을 경우 null로 되어 있는 경우 환자를 등록 뷰로 이동한다.
			return "/hospital/views/addPatient";
		}
		
		//return "/hospital/views/receive";
	}
	//접수 목록
	@RequestMapping(value = "/hospital/receiveList", method = RequestMethod.GET)
	public String receiveList(HttpSession session, Model model, HoReceive hoReceive) {
		// 로그인 세션을 뭘로 가져와야 할까.
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");

		List<HoReceive> receiveList = hoRRService.receiveList(hospitalCode);

		model.addAttribute("receiveList", receiveList);
		return "/hospital/views/receiveList";

	}
	//접수 상태 진료업데이트 receiveDiagnosis
	@RequestMapping(value="/hospital/receiveDiagnosis", method=RequestMethod.GET)
	public String receiveDiagnosis(HoReceive hp,
									@RequestParam(value="hoPatientCode") String hoPatientCode
			){
		System.out.println(hoPatientCode);
		
		System.out.println("receiveDiagnosis 이름이 온다 : "+hp);
		hoRRService.receiveDiagnosis(hoPatientCode); 
		return "redirect:/hospital/receiveList";
	}
}


