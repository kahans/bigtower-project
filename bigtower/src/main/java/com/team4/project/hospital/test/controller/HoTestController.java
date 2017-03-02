package com.team4.project.hospital.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.hospital.test.domain.HoMediaTest;

@Controller
public class HoTestController {

	@Autowired
	private HoTestService hoTS;
	
	@RequestMapping(value="/test/mediaTestList", method=RequestMethod.GET)
	public String mina(HoMediaTest hmt, Model model){
		System.out.println("영상검사 대기자 리스트 확인");
		//영상검사테이블에서 데이터를 불러와 list에 담는다.
		List<HoMediaTest> mediaList = hoTS.mediaTest(hmt);
		//뷰에서 작동할<c:forEach> item에 세팅한다.
		model.addAttribute("mediaTest", mediaList);
		return "/hospital/views/tests/mediaTestList";
	}
}
