package com.team4.project.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {
	private static final Logger logger = LoggerFactory.getLogger(Util.class);

	
	public static void main(String[] args){
		String a = "2015-02-13";
		String b = "";
		
		Map<String , Object> map= createDate(a , b);
		System.out.println("firstDate 확인 : "+map.get("firstDate")+" secondDate : "+map.get("secondDate"));
		
		
		
	}
	
	
	
	public static Map<String, Object> createDate(String firstDate, String secondDate){
		System.out.println("입력된 firstDate 확인 : "+firstDate);
		System.out.println("입력된 secondDate 확인 : "+secondDate);
		
		Map<String, Object> map = new HashMap<String, Object>();
		Date date = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentdate = transFormat.format(date);
		System.out.println("currentDate 확인 : "+currentdate);
		if(firstDate.equals("")&secondDate.equals("")){
			map.put("firstDate", "1900-01-01");
			map.put("secondDate", currentdate);
			logger.debug("firstDate 확인 : "+map.get("firstDate"));
			logger.debug("secondDate 들어갔는지 확인 : "+map.get("secondDate"));
			logger.debug("둘다 공백일때");
		}else if(firstDate.equals("")){
			map.put("firstDate", "1900-01-01");
			logger.debug("firstDate 확인 : "+map.get("firstDate"));
			logger.debug("앞이 공백일때");
		}else{
			map.put("secondDate", currentdate);
			logger.debug("뒤가 공백일때");
			logger.debug("secondDate 들어갔는지 확인 : "+map.get("secondDate"));
			
		}
		return map;
	
	}
}
