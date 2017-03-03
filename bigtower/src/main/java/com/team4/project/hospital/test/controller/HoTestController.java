package com.team4.project.hospital.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.project.hospital.test.domain.HoMediaTestSub;
import com.team4.project.hospital.test.domain.HoTestRequestSub;

@Controller
public class HoTestController {

	@Autowired
	private HoTestService hoTS;
	//영상검사 목록
	@RequestMapping(value="/hospital/test/mediaTestList", method=RequestMethod.GET)
	public String mediaTestList(HoTestRequestSub hmt, Model model){
		System.out.println("영상검사 대기자 리스트 확인");
		//영상검사테이블에서 데이터를 불러와 list에 담는다.
		List<HoTestRequestSub> mediaList = hoTS.mediaTest(hmt);
		//뷰에서 작동할<c:forEach> item에 세팅한다.
		System.out.println(mediaList.toString());
		model.addAttribute("mediaList", mediaList);
		return "/hospital/views/tests/mediaTestList";
	}
	//영상검사 등록 뷰 GET
	@RequestMapping(value="/hospital/test/mediaTestAdd", method=RequestMethod.GET)
	public String mediaTestView(Model model,
								@RequestParam(value="hoTestRequestCode",required=false )String hoTestRequestCode
			){
		System.out.println("해당 영상검사 글 뷰 GET");
		HoMediaTestSub mediaView = hoTS.mediaTestView(hoTestRequestCode);
		System.out.println(mediaView.toString());
		model.addAttribute("mediaView", mediaView);
		return "/hospital/views/tests/mediaTestAdd";
	}
	//영상검사 등록 POST
	@RequestMapping(value="/hospital/test/mediaTestAdd", method=RequestMethod.POST)
	public String mediaTestView(HoMediaTestSub mediaView){ 
		System.out.println("해당 영상검사 결과 등록 POST");
		System.out.println("등록POST : "+mediaView.toString());
		
		hoTS.mediaTestAdd(mediaView);
		
		
		return "redirect:/hospital/test/mediaTestList";
	}
}
