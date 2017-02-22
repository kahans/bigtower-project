package com.team4.project.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.team4.project.government.test.controller.GoTestController;

public class Util {
	private static final Logger logger = LoggerFactory.getLogger(Util.class);
/*
	public static Map<String, Object> createDate(String firstDate, String secondDate){
		Map<String, Object> map = new HashMap<String, Object>();
		Date date = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentdate = transFormat.format(date);
		System.out.println("currentDate 확인 : "+currentdate);
		if(firstDate.equals("")&secondDate.equals("")){
			map.put("firstDate", "1900-01-01");
			map.put("secondDate", currentdate);
			logger.debug("firstDate 확인 : "+map.get("firstDate"));
			logger.debug("secondDate 들어갔는지 확인 : "+map.);
			logger.debug("둘다 공백일때");
		}else if(firstDate.equals("")){
			GoFirstDate("1900-01-01");
			logger.debug("firstDate 확인 : "+goTest.getGoFirstDate());
			logger.debug("앞이 공백일때");
		}else{
			goTest.setGoSecondDate(currentdate);
			logger.debug("secondDate 들어갔는지 확인 : "+goTest.getGoSecondDate());
			logger.debug("뒤가 공백일때");
		}
		
		
		
		
	}*/
}
