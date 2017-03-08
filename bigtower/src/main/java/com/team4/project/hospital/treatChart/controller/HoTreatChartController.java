package com.team4.project.hospital.treatChart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.dto.HoDisease;
import com.team4.project.hospital.dto.HoMedicine;
import com.team4.project.hospital.dto.HoOperationType;
import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.dto.HoVaccineType;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.test.domain.HoTestRequest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

@Controller
public class HoTreatChartController {

	@Autowired
	private HoTreatChartService hoTCS;
	
	//차트 등록(뷰페이지 없음)
	@RequestMapping(value="/hospital/addChart", method=RequestMethod.GET)
	public String addChart(RedirectAttributes redidredctAttributes, 
						   HttpSession session,HoChart hoChart,
						   @RequestParam(value="hoCitizenId")String hoCitizenId
						   ){
		System.out.println("===================차트등록====================");
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE"); //세션에서 병원코드 겟팅
		hoChart.setHoHospitalCode(hoHospitalCode);
		System.out.println("hoChart : "+hoChart );
		hoTCS.addChart(hoChart);
		System.out.println("===================차트가 생성되었습니다====================");
		
		//receive폼에 보낼 환자 주민번호
		redidredctAttributes.addAttribute("hoCitizenId", hoCitizenId);
		return "redirect:/hospital/receive";
	}
	
	//진료 페이지
	@RequestMapping(value="/hospital/treatView", method=RequestMethod.GET)
	public String treatView(Model model,
			@RequestParam(value="hoTreatmentCode")String hoTreatmentCode){
		//검사 이름 가져오기, 질병이름 가져오기
		List<HoTest> testList = hoTCS.selectTest();
		List<HoDisease> diseaseList = hoTCS.selectDisease();
		List<HoOperationType> operationList = hoTCS.selectOperation();
		List<HoVaccineType> vaccineList = hoTCS.selectVaccine();
		List<HoMedicine> medicineList = hoTCS.selectMedicine();
		System.out.println("addPrescription 메서드의 hoTreatmentCode : "+hoTreatmentCode);
		model.addAttribute("hoTreatmentCode", hoTreatmentCode);
		model.addAttribute("medicineList",medicineList);
		HoTreat hoTreat = hoTCS.treatView(hoTreatmentCode);
		System.out.println("hoTreat의 진료코드 : " + hoTreat.getHoTreatmentCode());
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
							HoPrescription hoPrescription,
							HoVaccine hoVaccine,
							RedirectAttributes redirectAttributes,
							@RequestParam(value="diseaseSelect") List<String> diseaseList,
							@RequestParam(value="hoTestCode",required=false) List<String> testList,
							@RequestParam(value="medicineSelect") List<String> medicineList){
		System.out.println("testList : "+testList);
		System.out.println("hoTreat : "+hoTreat);
		System.out.println("hoOperation : "+hoOperation);
		System.out.println("hoPrescription : "+hoPrescription);
		System.out.println("hoVaccine : "+hoVaccine);
		System.out.println("checkHospitalization : "+checkHospitalization);
		System.out.println("medicineList"+medicineList);
		System.out.println("diseaseList : "+diseaseList);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hoTreat", hoTreat);
		map.put("testList", testList);
		map.put("checkHospitalization", checkHospitalization);
		map.put("hoOperation", hoOperation);
		map.put("hoPrescription", hoPrescription);
		map.put("hoVaccine", hoVaccine);
		map.put("medicineList", medicineList);
		map.put("diseaseList", diseaseList);
		int result = hoTCS.updateTreat(map);
		System.out.println("updateTreat 결과는 ? "+result);
		
		redirectAttributes.addAttribute("hoTreatmentCode",hoTreat.getHoTreatmentCode());
		redirectAttributes.addAttribute("diseaseList",diseaseList);
		return "redirect:/hospital/addDiagnosis";
	}
	
	
	
	
	//진료목록
	@RequestMapping(value="/hospital/treatList", method=RequestMethod.GET)
	public String treatmentList(HoTreatSub hp, HttpSession session, Model model){
		
		String hospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoTreatSub> treatList  = hoTCS.treatList(hospitalCode);
		System.out.println(treatList.toString());
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
		System.out.println("hoReceiveCode : "+hoReceiveCode);
		System.out.println("hoPatientCode : "+hoPatientCode);
		System.out.println("hoTreatSubjectCode : "+hoTreatSubjectCode);
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		String hoDoctorId = (String) session.getAttribute("DOCTORID");
		System.out.println("hoHospitalCode : "+hoHospitalCode);
		Map<String, String> map = new HashMap<String, String>();
		map.put("hoHospitalCode",hoHospitalCode);
		map.put("hoPatientCode",hoPatientCode);
		String hoChartCode = hoTCS.selectChartCode(map);
		System.out.println("hoChartCode : "+hoChartCode);		
		
		System.out.println("hoTreat 셋팅하기전 : "+hoTreat);
		hoTreat.setHoDoctorId(hoDoctorId);
		hoTreat.setHoPatientCode(hoPatientCode);
		hoTreat.setHoChartCode(hoChartCode);
		hoTreat.setHoHospitalCode(hoHospitalCode);
		hoTreat.setHoTreatSubjectCode(hoTreatSubjectCode);
		System.out.println("hoTreat 셋팅후 : "+hoTreat);
		int result = hoTCS.addTreat(hoTreat, hoReceiveCode);
		System.out.println("addTreat 결과는 ?"+ result);
		return "redirect:/hospital/treatList";
	}
	
}
