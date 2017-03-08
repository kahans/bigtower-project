package com.team4.project.hospital.test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.project.hospital.test.domain.HoBloodTestSub;
import com.team4.project.hospital.test.domain.HoMediaTestSub;
import com.team4.project.hospital.test.domain.HoTestRequestSub;

@Controller
public class HoTestController {

	@Autowired
	private HoTestService hoTS;
	//검사종류(혈액, 영상, 건강검진)선택 뷰
	@RequestMapping(value="/hospital/test", method=RequestMethod.GET)
	public String TestsView(){
		return "/hospital/views/tests/viewTest";
	}
/*	//검사요청 등록
	@RequestMapping(value="/hospital/test/testRequest", method=RequestMethod.POST)
	public String testRequest(HoTestRequestSub hoTestRequestSub){
		System.out.println(hoTestRequestSub.getHoTestCode());
		hoTS.addTestRequest(hoTestRequestSub);
		return "";
	}*/
	//혈액검사 상태 업데이트
	@RequestMapping(value="/hospital/test/updateBloodState", method=RequestMethod.GET)
	public String updateBloodState(HoTestRequestSub hoTestRequest,HttpSession session,
			@RequestParam(value="hoTestRequestCode", required=false)String hoTestRequestCode
			){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		hoTestRequest.setHoHospitalCode(hoHospitalCode);
		hoTestRequest.setHoTestRequestCode(hoTestRequestCode);
		hoTestRequest.setHoTestCode("1");
		hoTS.updateState(hoTestRequest);
		return "/hospital/views/tests/ListBloodTest";
	}
	
	//혈액검사 결과대기목록들
	@RequestMapping(value="/hospital/test/listBloodWait", method=RequestMethod.GET)
	public String listBloodWait(Model model,HoTestRequestSub hoTestRequest,
			HttpSession session
	){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		hoTestRequest.setHoTestCode("1");
		hoTestRequest.setHoHospitalCode(hoHospitalCode);		
		hoTestRequest.setHoTestStateCode(2);
		List<HoTestRequestSub> bloodList = hoTS.bloodTestList(hoTestRequest);
		
		model.addAttribute("bloodList", bloodList);
		return "/hospital/views/tests/listBloodWait";
	}
	//혈액검사 대기목록
	@RequestMapping(value="/hospital/test/ListBloodTest",method=RequestMethod.GET)
	public String BloodTestList(HoTestRequestSub hoTestRequest, Model model,
			HttpSession session
	){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		hoTestRequest.setHoTestCode("1");
		hoTestRequest.setHoHospitalCode(hoHospitalCode);
		hoTestRequest.setHoTestStateCode(1); 
		System.out.println(hoTestRequest.toString());
		List<HoTestRequestSub> bloodList = hoTS.bloodTestList(hoTestRequest);
		
		model.addAttribute("bloodList", bloodList);
		return "/hospital/views/tests/ListBloodTest";
	}
	
	//혈액검사등록 뷰 get
	@RequestMapping(value="/hospital/test/addBloodTest", method=RequestMethod.GET)
	public String bloodTestAdd(Model model, HttpSession session,
				@RequestParam(value="hoTestRequestCode", required=false)String hoTestRequestCode
			){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		
		HoBloodTestSub bloodView= hoTS.bloodTestView(hoTestRequestCode);
		//결과대기상태에서 결과등록 완료로 상태가 변경
		bloodView.setHoHospitalCode(hoHospitalCode);
		hoTS.updateBloodTestRequest(bloodView);
		//혈액검사 테이블에 insert 하기
		hoTS.addBlood(bloodView);
		model.addAttribute("bloodView",bloodView);
		return "/hospital/views/tests/addBloodTest";
	}
	
	//혈액검사등록 뷰 post
	@RequestMapping(value="/hospital/test/addBloodTest", method=RequestMethod.POST)
	public String bloodTestAdd(HoBloodTestSub bloodView,
			HttpServletRequest request,
			HttpSession session
	){
		
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		bloodView.setHoHospitalCode(hoHospitalCode);
		//request.getServletContext().getRealPath("D:\\testImage") 상대주소
		String path="D:\\testImage";//절대 주소
		//String path="C:\\sw\\testimage";//집에서 작성
		// 배포시사용할경로
		//String path = "/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/image";
		bloodView.setHoBloodTestImagePath(path);
		//혈액 검사 테이블 열을 업데이트를 한다
		hoTS.updateBloodTest(bloodView);
		//
		
		return "redirect:/hospital/test/ListBloodTest";
	}
	//영상검사대기 상태 업데이트
	@RequestMapping(value="/hospital/test/updateMediaState", method=RequestMethod.GET)
	public String updateMediaState(HoTestRequestSub hoTestRequest,HttpSession session,
			@RequestParam(value="hoTestRequestCode", required=false)String hoTestRequestCode
			){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		hoTestRequest.setHoHospitalCode(hoHospitalCode);
		hoTestRequest.setHoTestRequestCode(hoTestRequestCode);
		hoTestRequest.setHoTestCode("2");
		hoTS.updateState(hoTestRequest);
		return "/hospital/views/tests/ListBloodTest";
	}
	//영상검사 결과대기목록들
	@RequestMapping(value="/hospital/test/listMediaWait", method=RequestMethod.GET)
	public String listMediaWait(Model model,HoTestRequestSub hoTestRequest,
			HttpSession session
	){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		hoTestRequest.setHoTestCode("2");
		hoTestRequest.setHoHospitalCode(hoHospitalCode);		
		hoTestRequest.setHoTestStateCode(2);
		List<HoTestRequestSub> mediaList = hoTS.mediaTestList(hoTestRequest);
		
		model.addAttribute("mediaList", mediaList);
		return "/hospital/views/tests/listMediaWait";
	}
	//영상검사 목록
	@RequestMapping(value="/hospital/test/listMediaTest", method=RequestMethod.GET)
	public String mediaTestList(HoTestRequestSub hoTestRequest, Model model,
			HttpSession session){
		System.out.println("영상검사 대기자 리스트 확인");
		//영상검사테이블에서 데이터를 불러와 list에 담는다.

		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		hoTestRequest.setHoTestCode("2");
		hoTestRequest.setHoHospitalCode(hoHospitalCode);		
		hoTestRequest.setHoTestStateCode(1);
		
		List<HoTestRequestSub> mediaList = hoTS.mediaTestList(hoTestRequest);
		//뷰에서 작동할<c:forEach> item에 세팅한다.
		model.addAttribute("mediaList", mediaList);
		return "/hospital/views/tests/listMediaTest";
	}
	
	//영상검사 등록 뷰 GET
	@RequestMapping(value="/hospital/test/addMediaTest", method=RequestMethod.GET)
	public String mediaTestView(Model model, HttpSession session,
								@RequestParam(value="hoTestRequestCode",required=false )String hoTestRequestCode
			){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		System.out.println("해당 영상검사 글 뷰 GET");
		System.out.println(hoTestRequestCode);
		HoMediaTestSub mediaView = hoTS.mediaTestView(hoTestRequestCode);
		mediaView.setHoHospitalCode(hoHospitalCode);
		//영상테이블에 들어갈 초기데이터 입력
		hoTS.updateMediaTestRequest(mediaView);
		hoTS.addMedia(mediaView);
		
		System.out.println(mediaView.toString());
		model.addAttribute("mediaView", mediaView);
		return "/hospital/views/tests/addMediaTest";
	}
	
	//영상검사 등록 POST
	@RequestMapping(value="/hospital/test/addMediaTest", method=RequestMethod.POST)
	public String mediaTestView(HoMediaTestSub mediaView,
			HttpServletRequest request,
			HttpSession session
		){ 
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		mediaView.setHoHospitalCode(hoHospitalCode);
		System.out.println("해당 영상검사 결과 등록 POST");
		System.out.println("등록POST : "+mediaView.toString());
		//request.getServletContext().getRealPath("D:\\testImage") 상대주소
		String path="D:\\testImage";//절대 주소
		// 배포시사용할경로
		//String path = "/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/image";
		System.out.println("path:"+path);
		mediaView.setHoMediaTestImagePath(path);
		
		hoTS.updateMediaTest(mediaView);
		
		
		
		return "redirect:/hospital/test/listMediaTest";
	}
}
