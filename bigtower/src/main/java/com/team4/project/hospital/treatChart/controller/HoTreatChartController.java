package com.team4.project.hospital.treatChart.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.project.government.dto.GoMedicine;
import com.team4.project.hospital.controller.HospitalController;
import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.dto.HoDisease;
import com.team4.project.hospital.dto.HoMedicine;
import com.team4.project.hospital.dto.HoOperationType;
import com.team4.project.hospital.dto.HoPatient;
import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.dto.HoVaccineType;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.test.domain.HoTestRequest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;
import com.team4.project.util.GetReferenceData;

@Controller
public class HoTreatChartController {
	private static final Logger logger = LoggerFactory.getLogger(HoTreatChartController.class);

	@Autowired
	private HoTreatChartService hoTCS;
	
	//차트 등록(뷰페이지 없음)
	@RequestMapping(value="/hospital/addChart", method=RequestMethod.GET)
	public String addChart(RedirectAttributes redirectAttributes, 
						   HttpSession session,HoChart hoChart,
						   @RequestParam(value="hoCitizenId")String hoCitizenId
						   ){
		logger.debug("===================차트등록====================");
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE"); //세션에서 병원코드 겟팅
		hoChart.setHoHospitalCode(hoHospitalCode);
		logger.debug("hoChart : "+hoChart );
		hoTCS.addChart(hoChart);
		logger.debug("===================차트가 생성되었습니다====================");
		HoPatient hp = hoTCS.selectOnePatient(hoCitizenId, hoHospitalCode);
		//receive폼에 보낼 환자 주민번호
		redirectAttributes.addAttribute("hoCitizenId", hoCitizenId);
		redirectAttributes.addAttribute("hoCitizenId",hp.getHoCitizenId());
		redirectAttributes.addAttribute("hoPatientName",hp.getHoPatientName());
		redirectAttributes.addAttribute("hoPatientPhone",hp.getHoPatientPhone());
		redirectAttributes.addAttribute("hoPatientAddress",hp.getHoPatientAddress());
		redirectAttributes.addAttribute("hoPatientDetailAddress",hp.getHoPatientDetailAddress());
		redirectAttributes.addAttribute("hoZipCode",hp.getHoZipCode());
		redirectAttributes.addAttribute("hoPatientCode",hp.getHoPatientCode());
		return "redirect:/hospital/receive";
	}
	
	//진료 페이지
	@RequestMapping(value="/hospital/treatView", method=RequestMethod.GET)
	public String treatView(Model model,
			HttpSession session,
			@RequestParam(value="hoTreatmentCode")String hoTreatmentCode){
		//검사 이름 가져오기, 질병이름 가져오기
		String doctorId = (String) session.getAttribute("DOCTORID");
		List<HoTest> testList = hoTCS.selectTest();
		List<HoDisease> diseaseList = GetReferenceData.getDiseaseCode(doctorId);
		List<HoOperationType> operationList = GetReferenceData.getSurgeryCode(doctorId);
		List<HoVaccineType> vaccineList = GetReferenceData.getVaccinationCode(doctorId);
		List<HoMedicine> medicineList = GetReferenceData.getMedicineCode(doctorId);
		logger.debug("addPrescription 메서드의 hoTreatmentCode : "+hoTreatmentCode);
		model.addAttribute("hoTreatmentCode", hoTreatmentCode);
		model.addAttribute("medicineList",medicineList);
		HoTreat hoTreat = hoTCS.treatView(hoTreatmentCode);
		logger.debug("hoTreat의 진료코드 : " + hoTreat.getHoTreatmentCode());
		model.addAttribute("hoTreat",hoTreat);
		model.addAttribute("testList", testList);
		model.addAttribute("diseaseList", diseaseList);
		model.addAttribute("operationList", operationList);
		model.addAttribute("vaccineList", vaccineList);
		return "/hospital/views/treatment/treatView";
	}
	
	//진료 내용 업데이트
	@RequestMapping(value="/hospital/treatView", method=RequestMethod.POST)
	public String treatView(HoTreat hoTreat,							
							String checkHospitalization,
							HoOperation hoOperation,
							HoVaccine hoVaccine,
							RedirectAttributes redirectAttributes,
							@RequestParam(value="hoPrescriptionDailydose") List<String> hoPrescriptionDailydose,
							@RequestParam(value="hoPrescriptionDailycount") List<String> hoPrescriptionDailycount,
							@RequestParam(value="hoPrescriptionTotalday") List<String> hoPrescriptionTotalday,
							@RequestParam(value="hoPrescriptionUsage") List<String> hoPrescriptionUsage,
							@RequestParam(value="hoMedicineCode") List<String> hoMedicineCode,
							@RequestParam(value="diseaseSelect") List<String> diseaseList,
							@RequestParam(value="hoTestCode",required=false) List<String> testList){
		logger.debug("testList : "+testList);
		logger.debug("hoTreat : "+hoTreat);
		logger.debug("hoOperation : "+hoOperation);
		logger.debug("hoPrescriptionDailydose : "+hoPrescriptionDailydose);
		logger.debug("hoPrescriptionDailycount : "+hoPrescriptionDailycount);
		logger.debug("hoPrescriptionTotalday : "+hoPrescriptionTotalday);
		logger.debug("hoPrescriptionUsage : "+hoPrescriptionUsage);
		logger.debug("hoMedicineCode : "+hoMedicineCode);
		logger.debug("hoVaccine : "+hoVaccine);
		logger.debug("checkHospitalization : "+checkHospitalization);
		//logger.debug("medicineList"+medicineList);
		logger.debug("diseaseList : "+diseaseList);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hoTreat", hoTreat);
		map.put("testList", testList);
		map.put("checkHospitalization", checkHospitalization);
		map.put("hoOperation", hoOperation);
		map.put("hoPrescriptionDailydose", hoPrescriptionDailydose);
		map.put("hoPrescriptionDailycount", hoPrescriptionDailycount);
		map.put("hoPrescriptionTotalday", hoPrescriptionTotalday);
		map.put("hoPrescriptionUsage", hoPrescriptionUsage);
		map.put("hoMedicineCode", hoMedicineCode);
		map.put("hoVaccine", hoVaccine);
		//map.put("medicineList", medicineList);
		map.put("diseaseList", diseaseList);
		int result = hoTCS.updateTreat(map);
		logger.debug("updateTreat 결과는 ? "+result);
		
		redirectAttributes.addAttribute("hoTreatmentCode",hoTreat.getHoTreatmentCode());
		redirectAttributes.addAttribute("diseaseList",diseaseList);
		return "redirect:/hospital/addDiagnosis";
	}
	
	
	
	
	//진료목록
	@RequestMapping(value="/hospital/treatList", method=RequestMethod.GET)
	public String treatmentList(HoTreatSub hp, HttpSession session, Model model){
		
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoTreatSub> treatList  = hoTCS.treatList(hospitalCode);
		logger.debug(treatList.toString());
		model.addAttribute("treatList", treatList);
		return "/hospital/views/treatment/treatmentList";
	}
	
	//접수 목록에서 접수완료를 클릭시 진료 데이터 생성
	@RequestMapping(value="/hospital/addTreat")
	public String addTreat(String hoPatientCode,
						   String hoTreatSubjectCode,
						   String hoReceiveCode,
						   HoTreat hoTreat,
						   HttpSession session){
		logger.debug("hoReceiveCode : "+hoReceiveCode);
		logger.debug("hoPatientCode : "+hoPatientCode);
		logger.debug("hoTreatSubjectCode : "+hoTreatSubjectCode);
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		String hoDoctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("hoHospitalCode : "+hoHospitalCode);
		Map<String, String> map = new HashMap<String, String>();
		map.put("hoHospitalCode",hoHospitalCode);
		map.put("hoPatientCode",hoPatientCode);
		String hoChartCode = hoTCS.selectChartCode(map);
		logger.debug("hoChartCode : "+hoChartCode);		
		
		logger.debug("hoTreat 셋팅하기전 : "+hoTreat);
		hoTreat.setHoDoctorId(hoDoctorId);
		hoTreat.setHoPatientCode(hoPatientCode);
		hoTreat.setHoChartCode(hoChartCode);
		hoTreat.setHoHospitalCode(hoHospitalCode);
		hoTreat.setHoTreatSubjectCode(hoTreatSubjectCode);
		logger.debug("hoTreat 셋팅후 : "+hoTreat);
		int result = hoTCS.addTreat(hoTreat, hoReceiveCode);
		logger.debug("addTreat 결과는 ?"+ result);
		return "redirect:/hospital/receiveList";
	}
	
}
