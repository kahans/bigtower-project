package com.team4.project.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {
	private static final Logger logger = LoggerFactory.getLogger(Util.class);
	//날짜검색시 공백인 칸에 날짜 만들어주는 메소드
	public static Map<String, Object> createDate(String firstDate, String secondDate){
		System.out.println("입력된 firstDate 확인 : "+firstDate);
		System.out.println("입력된 secondDate 확인 : "+secondDate);
		
		Map<String, Object> map = new HashMap<String, Object>();
		//Date객체를 생성하여 오늘날짜를 받아옴
		Date date = new Date();
		//Date의 형태를 yyyy-mm-dd로 바꿔줌
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		//받아온 현재날짜를 yyyy-mm-dd형태로 바꿔줌
		String currentdate = transFormat.format(date);
		System.out.println("currentDate 확인 : "+currentdate);
		
		//if문을 통해 날짜검색시 입력된 날짜의 공백여부를 확인하여 값을 만들어 맵에 넣어줌
		if(firstDate.equals("")&secondDate.equals("")){
			logger.debug("둘다 공백일때");
			map.put("firstDate", "1900-01-01");
			map.put("secondDate", currentdate);
			logger.debug("firstDate 확인 : "+map.get("firstDate"));
			logger.debug("secondDate 들어갔는지 확인 : "+map.get("secondDate"));
			
		}else if(firstDate.equals("")&!secondDate.equals("")){
			logger.debug("firstDate는 공백이고 secondDate는 공백이 아닐때");
			map.put("firstDate", "1900-01-01");
			map.put("secondDate", secondDate);
			
			logger.debug("firstDate 확인 : "+map.get("firstDate"));
			logger.debug("secondDate 들어갔는지 확인 : "+map.get("secondDate"));
			
		}else if(!firstDate.equals("")&secondDate.equals("")){
			logger.debug("firstDate는 값이 있고 secondDate가 공백일때");
			map.put("firstDate", firstDate);
			map.put("secondDate", currentdate);
			
			logger.debug("firstDate 확인 : "+map.get("firstDate"));
			logger.debug("secondDate 들어갔는지 확인 : "+map.get("secondDate"));
		}else{
			logger.debug("firstDate, secondDate 모두 값이 있을때");
			map.put("firstDate", firstDate);
			map.put("secondDate", secondDate);
			logger.debug("firstDate 확인 : "+map.get("firstDate"));
			logger.debug("secondDate 들어갔는지 확인 : "+map.get("secondDate"));
		}
		//날짜값이 담긴 map을 리턴시킴
		return map;
	
	}
}
