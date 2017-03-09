package com.team4.project.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.team4.project.government.dto.GoMedicine;

public class GetReferenceData {
	private static Gson gson = new Gson();
	private static String url = ContextParam.context.getInitParameter("receiveUrl");
	
	
	public static List<GoMedicine> getMedicineCode(String doctorId){
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getMedicineCode");
		List<GoMedicine> list = null;
		try {
			// doctorId를 맵에 담는다
			Map<String, String> map = new HashMap<String, String>();
			map.put("doctorId", doctorId);
			// 맵을 위 url로 전송하고 약 리스트를 리턴받는다
			String medicineCode = conn.HttpUrlPOST(map);
			System.out.println("medicineCode:"+medicineCode);
			// 리스트타입의 json을 java List 타입으로 parsing 한다 
			GoMedicine[] array = gson.fromJson(medicineCode, GoMedicine[].class);
			list = Arrays.asList(array);
			System.out.println("list:"+list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
