package com.team4.project.government.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.HomeController;
import com.team4.project.government.test.domain.GoBloodTest;

@Controller
public class GoTestController {
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTS;
	
	//�삁�븸寃��궗 �슂泥��럹�씠吏�
	@RequestMapping(value="/goBloodTest", method=RequestMethod.GET)
	public String selectBloodTest(){
		System.out.println("�삁�븸寃��궗�슂泥��럹�씠吏�濡� �씠�룞");
		return "/governmentYJ/bloodTestResultForm";
	}
	
	//�삁�븸寃��궗 �궇吏� �엯�젰�븯�뿬 寃��깋 GET�슂泥��쑝濡� �뤌�쑝濡� �씠�룞�븯�뿬 POST�슂泥��뿉�꽌 �궇吏쒓컪�쓣 諛쏆븘�빞 �븯吏�留�
	//�뀒�뒪�듃瑜� �쐞�빐 GET諛⑹떇�뿉�꽌 媛믪쓣 吏곸젒 �꽭�똿�빐二쇱뿀�쓬. 李⑦썑 �닔�젙�슂留�
	@RequestMapping(value="/goBloodTest", method=RequestMethod.POST)
	public String selectBloodTest(GoBloodTest goBloodTest){
			System.out.println("�삁�븸寃��궗 �슂泥��럹�씠吏��뿉�꽌 �궇吏� �꽆寃⑤컺�쓬");
			//goBloodTest�뿉 �엯�젰諛쏆� �궇吏쒕�� 吏곸젒�꽭�똿�빐以� 
		/*	goBloodTest.setGoFirstDate("2016-02-20");
			goBloodTest.setGoSecondDate("2017-02-20");*/
			
			//goBloodTest�뿉 吏곸젒 �엯�젰�빐以� 媛믪씠 �뱾�뼱�솕�뒗吏� �솗�씤(李⑦썑�뿉�뒗 �꽆寃⑤컺�� 媛믪쓣 �솗�씤)
			logger.debug("goBloodTest : "+goBloodTest.toString());
			System.out.println("�엯�젰諛쏆� �궇吏� �솗�씤 : "+goBloodTest.getGoFirstDate());
			System.out.println("�엯�젰諛쏆� �궇吏� �솗�씤 : "+goBloodTest.getGoSecondDate());
			//�엯�젰諛쏆� �궇吏쒕�� 媛�吏�怨� 寃��깋�븳 �썑 洹� 媛믪쓣 goTest�뿉 �떞�쓬
			List<GoBloodTest> goTest= goTS.selectBlood(goBloodTest);
			
			//for臾몄쓣 �넻�빐 寃��깋�쓣 �넻�빐 媛��졇�삩 媛앹껜瑜� �솗�씤�빐遊�.
			for(GoBloodTest x : goTest){
				logger.debug("�솗�씤 : "+x.toString());
			}
				
		return "";
	}
	
	//�븳紐낆쓽 �솚�옄�쓽 �삁�떦�닔移섎━�뒪�듃瑜� 議고쉶�븿.
	@RequestMapping(value="/goBloodTestSugar", method=RequestMethod.GET)
	public String selectBloodTestSugar(GoBloodTest goBloodTest){
		//goBloodTest�뿉 吏꾨즺肄붾뱶瑜� �꽭�똿�빐二쇨퀬 議고쉶(異뷀썑 goBloodTest媛앹껜�뿉 媛믪씠 �뱾�뼱�엳�쓣�삁�젙)
		goBloodTest.setGoTreatCode("treat_01");
		
		//goBloodTest�뿉 吏곸젒 �엯�젰�빐以� 媛믪씠 �뱾�뼱�솕�뒗吏� �솗�씤
		logger.debug("goBloodTestSugar :"+goBloodTest.toString());
		//�엯�젰諛쏆� �궇吏쒕�� 媛�吏�怨� 寃��깋�븳 �썑 洹� 媛믪쓣 goTestSugar�뿉 �떞�쓬
		List<GoBloodTest> goTestSugar = goTS.selectBloodSugar(goBloodTest);
		//for臾몄쓣 �넻�빐 媛��졇�삩 媛앹껜瑜� �솗�씤
		for(GoBloodTest x : goTestSugar){
			logger.debug("�솗�씤 : " +x.toString());
		}
		
		return "";
	}
}
