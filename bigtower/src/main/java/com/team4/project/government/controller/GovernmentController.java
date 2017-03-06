package com.team4.project.government.controller;

import java.util.Arrays;
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
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.team4.project.HomeController;
import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;
import com.team4.project.government.dto.GoMedicine;

import com.team4.project.util.HttpUrlCon;

@Controller
public class GovernmentController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private GovernmentService goService;
	
	//httpUrlConnection Test
	@RequestMapping(value="/government/getData", method=RequestMethod.POST)
	public String getData(String id, String name, Model model){
		goService.addData(id, name);
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "home";
	}
	
	//초기화면 보여주기
	@RequestMapping(value="/government/", method=RequestMethod.GET)
	public String index(HttpSession session, Model model){
		logger.debug("index 메서드 호출");
		return "/government/index";
	}
	
	
	//로그인 화면 보여주기
	@RequestMapping(value="/government/login", method=RequestMethod.GET )
	public String login(){
		return "/government/login";
	}
	
	//국민 로그인
	@RequestMapping(value="/government/loginCitizen", method=RequestMethod.POST )
	public String login(GoCitizen goCitizen, String birthDate, String serialNo, HttpSession session){
		logger.debug("GoLoginCitizenSub_goLoginCitizen:"+goCitizen);
		goCitizen.setGoCitizenId(birthDate+"-"+serialNo);
		goCitizen = goService.loginCheck(goCitizen);
		logger.debug("goCitizen:"+goCitizen);
		//session.invalidate();
		session.setAttribute("FLAG", "citizen");
		session.setAttribute("GOCITIZENNO", goCitizen.getGoCitizenNo());
		session.setAttribute("GOCITIZENID", goCitizen.getGoCitizenId());
		session.setAttribute("GOCITIZENNAME", goCitizen.getGoCitizenName());
		return "redirect:/government/";
	}
	
	//병원 로그인
	@RequestMapping(value="/government/loginHospital", method=RequestMethod.POST )
	public String login(GoHospital goHospital, HttpSession session){
		logger.debug("GoHospital_goLoginInfo:"+goHospital);
		goHospital = goService.loginCheck(goHospital);
		logger.debug("goHospital:"+goHospital);
		//session.invalidate();
		session.setAttribute("FLAG", "hospital");
		session.setAttribute("GOHOSPITALID", goHospital.getGoHospitalId());
		session.setAttribute("GOHOSPITALNAME", goHospital.getGoHospitalName());
		return "redirect:/government/";
	}
	
	//로그아웃
	@RequestMapping(value="/government/logout", method=RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		logger.debug("session invalidate!!");
		return "redirect:/government/";
	}
	
	//약코드 가져오기 POST
	@ResponseBody
	@RequestMapping(value="/government/getMedicineCode", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getMdedicine(String id, String name){
		logger.debug("getMdedicine POST 진입");
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		List<GoMedicine> list = goService.getMedicine();
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		

		//logger.debug("List<GoMedicine>:"+list);
		return jsonStr;
	}
	
	//약코드 가져오기 GET
	@ResponseBody
	@RequestMapping(value="/government/getMedicineCode", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getMdedicine(String id){
		logger.debug("getMdedicine GET 진입");
		System.out.println("id:"+id);
		List<GoMedicine> list = goService.getMedicine();
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		
		return jsonStr;
	}
	
	// 약코드가져오는 controller 호출하기
	@RequestMapping(value = "/government/getMedicine", method = RequestMethod.GET)
	public String getMedicine(){
		System.out.println("getMedicine 진입");
		
		HttpUrlCon huc = new HttpUrlCon("http://localhost/project/government/getMedicineCode?id=dd");
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "11");
		map.put("name", "똥꾸");
		try {
			String result = huc.HttpUrlGET();
			System.out.println("result:"+result);
			Gson gson = new Gson();
			
			// json to list 방법1 
			GoMedicine[] array = gson.fromJson(result, GoMedicine[].class);
			List<GoMedicine> list = Arrays.asList(array);
			for(int i=0; i<list.size();i++){
				//GoMedicine goMedicine = gson.fromJson(list.get(i), GoMedicine.class);
				System.out.println("코드:"+list.get(i).getGoMedicineCode()+
						" 이름:"+list.get(i).getGoMedicineName());
			}
			
			/*
			// json to list 방법2
			List<GoMedicine> list2 = gson.fromJson(result, new TypeToken<List<GoMedicine>>(){}.getType());
			System.out.println("=======list 돌리기======");
			for(int i=0; i<list2.size();i++){
				//GoMedicine goMedicine = gson.fromJson(list.get(i), GoMedicine.class);
				System.out.println("코드:"+list2.get(i).getGoMedicineCode()+
						" 이름:"+list2.get(i).getGoMedicineName());
			}
			*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		HttpURLConnection conn = null;
		try {
			URL url = new URL("http://localhost/project/government/getMedicineCode");
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET"); // 요청 방식을 설정 (default : GET)

			conn.setDoInput(true); // input을 사용하도록 설정 (default : true)
			conn.setDoOutput(true); // output을 사용하도록 설정 (default : false)

			conn.setConnectTimeout(60); // 타임아웃 시간 설정 (default : 무한대기)
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8")); // 캐릭터셋 설정
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = br.readLine()) != null) {
				if (sb.length() > 0) {
					sb.append("\n");
				}
				sb.append(line);
			}
			System.out.println("response:" + sb.toString());
			

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		return "";
	}
	
	// 유민이꺼 혈액검사 검색조건 보내주기 테스트
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(){
		
	
		
		/*Gson gson = new Gson();
		String jsonStr = gson.toJson();
		Map<String, String> map = new HashMap<String, String>();
		map.put("imageTestSearch", jsonStr);
		 */
		HttpUrlCon huc = new HttpUrlCon("http://192.168.123.147/project/government/goImageTest");
		try {
			//String result = huc.HttpUrlPOST(map);
			//System.out.println("result:"+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
