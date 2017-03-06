package com.team4.project.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpUrlCon {
	private static final String DEFAULT_ENCODING = "UTF-8";
	
	private String url;
	
	/**
	 * @url 접속할url
	*/
	public HttpUrlCon(String url){
		this.url = url;
	}
	
	// GET방식 encoding타입을 따로 지정해주지 않으면 default인 utf-8로 셋팅
	public String HttpUrlGET() throws Exception{
		return HttpUrlGET(DEFAULT_ENCODING);
	}
	
	// GET방식으로 연결하기
	public String HttpUrlGET(String resEncoding) throws Exception{
		URL url = new URL(this.url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET"); // 요청 방식을 설정 (default : GET)
		conn.setDoInput(true); // input을 사용하도록 설정 (default : true)
		conn.setDoOutput(true); // output을 사용하도록 설정 (default : false)
		conn.setConnectTimeout(60); // 타임아웃 시간 설정 (default : 무한대기)
		conn.connect();
		
		//응답결과 받아오기
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in, resEncoding)); // 캐릭터셋 설정
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = br.readLine()) != null) {
			if (sb.length() > 0) {
				sb.append("\n");
			}
			sb.append(line);
		}
		return sb.toString();
	}
	
	// POST방식 req, res encoding방식을 지정하지 않으면 default인 utf-8로 셋팅
	public String HttpUrlPOST(Map<String, String> map) throws Exception{
		return HttpUrlPOST(map, DEFAULT_ENCODING, DEFAULT_ENCODING);
	}
	
	// POST 방식으로 연결하기
	public String HttpUrlPOST(Map<String, String> map, String reqEncoding, String resEncoding) throws Exception{
		URL url = new URL(this.url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST"); // 요청 방식을 설정 (default : GET)
		conn.setDoInput(true); // input을 사용하도록 설정 (default : true)
		conn.setDoOutput(true); // output을 사용하도록 설정 (default : false)
		conn.setConnectTimeout(60); // 타임아웃 시간 설정 (default : 무한대기)
		conn.connect();
		//OutputStream에 전달할 data 쓰기
		OutputStream os = conn.getOutputStream();
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, reqEncoding)); // 캐릭터셋 설정
		for( String key : map.keySet() ){
			writer.write(key+"=" + map.get(key) + "&"); // 요청 파라미터를 입력
		}
		//스트림의 버퍼를 비워준다.
		writer.flush();
		writer.close();

		//스트림을 닫아준다.
		os.close();
		//응답결과 받아오기
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in, resEncoding)); // 캐릭터셋 설정
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = br.readLine()) != null) {
			if (sb.length() > 0) {
				sb.append("\n");
			}
			sb.append(line);
		}
		return sb.toString();
	}
}
