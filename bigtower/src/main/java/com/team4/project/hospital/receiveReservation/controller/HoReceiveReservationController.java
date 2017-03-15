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
import com.team4.project.hospital.receiveReservation.domain.HoReceiveSub;
import com.team4.project.util.GetReferenceData;


@Controller
public class HoReceiveReservationController {
	private static final Logger logger = LoggerFactory.getLogger(HoReceiveReservationController.class);
	@Autowired
	private HoReceiveReservationService hoRRService;
	
	//접수폼 보여주기
	@RequestMapping(value="/hospital/receive", method=RequestMethod.GET)
	public String addOneReceive(Model model, HttpSession session,
			String hoCitizenId, String hoPatientName, String hoPatientPhone,
			String hoPatientAddress, String hoPatientDetailAddress, String hoZipCode, String hoPatientCode){
		String doctorId = (String) session.getAttribute("DOCTORID");
		List<HoTreatSubject> treatSubjectList = GetReferenceData.getTreatSubjectCode(doctorId);
		System.out.println("treatSubjectList :" + treatSubjectList);
		model.addAttribute("hoCitizenId",hoCitizenId);
		model.addAttribute("hoPatientName",hoPatientName);
		model.addAttribute("hoPatientPhone",hoPatientPhone);
		model.addAttribute("hoPatientAddress",hoPatientAddress);
		model.addAttribute("hoPatientDetailAddress",hoPatientDetailAddress);
		model.addAttribute("hoZipCode",hoZipCode);
		model.addAttribute("hoPatientCode",hoPatientCode);
		model.addAttribute("treatSubjectList",treatSubjectList);
		logger.debug("addPatient GET");
		return "/hospital/views/receive/receive";
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
		System.out.println("hoReceiveSub : "+ hoReceiveSub.toString());
		hoRRService.addReceive(hoReceiveSub);
		return "redirect:/hospital/searchPatient";
	}
	
	//ajax 한명의 환자정보 조회
	@RequestMapping(value="hospital/searchReceive", method=RequestMethod.POST)
	public @ResponseBody HoPatient searchOnePatient(@RequestParam("hoCitizenId")String hoCitizenId,
			HttpSession session){
		logger.debug("searchOnePatient POST");
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");
		HoPatient hopatient = hoRRService.searchOnePatient(hoCitizenId, hospitalCode);
		logger.debug("hopatient:"+hopatient);
		
		return hopatient;
	}
	
	//초진, 재진 뷰 보기
	@RequestMapping(value="/hospital/searchPatient", method=RequestMethod.GET)
	public String searchOnePatientTest(){
		logger.debug("searchOnePatientTest GET 화면 불러오기");
		return "/hospital/views/patient/searchPatient";
	}
	
	//초진, 재진 조회
	@RequestMapping(value="/hospital/searchPatient", method=RequestMethod.POST)
	public String searchOnePatientTest(String hoPatientName, HttpSession session, Model model, RedirectAttributes redirectAttributes,
										@RequestParam(value="hocitizenId") String hocitizenId){
		logger.debug("searchOnePatientTest POST 데이터 보내기");
		//뷰에서 받은 주민번호를 controller에서 처리를 한다.
		//앞,뒤로 받은 주민번호를 하나의 문자열로 합치고, DTO에 set으로 세팅한다.
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		System.out.println("주민번호 : "+hocitizenId);
		HoPatient hp = new HoPatient();
		hp.setHoCitizenId(hocitizenId);
		hp.setHoHospitalCode(hoHospitalCode);
		hp.setHoPatientName(hoPatientName);
		
		//dto에 들어간 데이터를 확인
		System.out.println(hp.toString());
		hp = hoRRService.searchPatientTest(hp);
		System.out.println("receiveController에서의 환자정보 : "+hp);
		if(hp!=null){ //널이 아니면 접수등록으로 이동한다.
			redirectAttributes.addAttribute("hoCitizenId",hp.getHoCitizenId());
			redirectAttributes.addAttribute("hoPatientName",hp.getHoPatientName());
			redirectAttributes.addAttribute("hoPatientPhone",hp.getHoPatientPhone());
			redirectAttributes.addAttribute("hoPatientAddress",hp.getHoPatientAddress());
			redirectAttributes.addAttribute("hoPatientDetailAddress",hp.getHoPatientDetailAddress());
			redirectAttributes.addAttribute("hoZipCode",hp.getHoZipCode());
			redirectAttributes.addAttribute("hoPatientCode",hp.getHoPatientCode());
			return "redirect:/hospital/receive";
		}else{ //초진을 경우 null로 되어 있는 경우 환자를 등록 뷰로 이동한다.
			model.addAttribute("hoCitizenId", hocitizenId);
			model.addAttribute("hoPatientName", hoPatientName);
			return "/hospital/views/patient/addPatient";
		}
	}
	
	//접수 목록
	@RequestMapping(value = "/hospital/receiveList", method = RequestMethod.GET)
	public String receiveList(HttpSession session, Model model, HoReceiveSub hoReceive) {
		// 로그인 세션을 뭘로 가져와야 할까.
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoReceiveSub> receiveList = hoRRService.receiveList(hospitalCode);
		model.addAttribute("receiveList", receiveList);
		return "/hospital/views/receive/receiveList";

	}

	//수납대기 목록
	@RequestMapping(value="/hospital/payList", method=RequestMethod.GET)
	public String payList(HoReceiveSub hp, HttpSession session, Model model){
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoReceiveSub> payList = hoRRService.payList(hospitalCode);
		model.addAttribute("payList", payList);
		return "/hospital/views/receive/payList";
	}
	
	//수납완료
	@RequestMapping(value="/hospital/payComplete")
	public String payComplete(String hoReceiveCode){
		System.out.println("수납완료를 위한 : "+hoReceiveCode);
		hoRRService.payComplete(hoReceiveCode);
		return "redirect:/hospital/payList";
	}
}


