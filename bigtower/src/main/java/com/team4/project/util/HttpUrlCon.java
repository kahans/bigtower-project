package com.team4.project.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

public class HttpUrlCon {
	private static final String DEFAULT_ENCODING = "UTF-8";

	private String url;

	/**
	 * @url 접속할url
	 */
	public HttpUrlCon(String url) {
		this.url = url;
	}

	// GET방식 encoding타입을 따로 지정해주지 않으면 default인 utf-8로 셋팅
	public String HttpUrlGET() throws Exception {
		return HttpUrlGET(DEFAULT_ENCODING);
	}

	// GET방식으로 연결하기
	public String HttpUrlGET(String resEncoding) throws Exception {
		URL url = new URL(this.url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET"); // 요청 방식을 설정 (default : GET)
		conn.setDoInput(true); // input을 사용하도록 설정 (default : true)
		conn.setDoOutput(true); // output을 사용하도록 설정 (default : false)
		conn.setConnectTimeout(60); // 타임아웃 시간 설정 (default : 무한대기)
		conn.connect();

		// 응답결과 받아오기
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in, resEncoding)); // 캐릭터셋
																						// 설정
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
	public String HttpUrlPOST(Map<String, String> map) throws Exception {
		return HttpUrlPOST(map, DEFAULT_ENCODING, DEFAULT_ENCODING);
	}

	// POST 방식으로 매개변수와 파일 전송하기
	public String HttpUrlFilePOST(Map<String, Object> map) throws Exception {
		return HttpUrlFilePOST(map, DEFAULT_ENCODING, DEFAULT_ENCODING);
	}
	
	// POST 방식으로 매개변수와 파일 전송하기
	public String HttpUrlFilePOST(Map<String, Object> map, String reqEncoding, String resEncoding) throws Exception {
		URL url = new URL(this.url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String doubleDash = "--";
		String boundary = "**asdjk90234**";
		String rn = "\r\n";

		// 읽기와 쓰기 모두 가능하게 설정
		conn.setDoInput(true);
		conn.setDoOutput(true);

		// 캐시를 사용하지 않게 설정
		conn.setUseCaches(false);

		// POST타입으로 설정
		conn.setRequestMethod("POST");

		// 헤더 설정
		conn.setRequestProperty("Connection", "Keep-Alive");
		conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);

		// Output스트림을 열어
		DataOutputStream dos = new DataOutputStream(conn.getOutputStream());


		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext()){
			// 맵의 key값을 얻어온다.
			String key = i.next();
			// 맵의 객체가 File 타입으로 변환이 가능하면 파일이므로 ouputStream에 file을 쓴다
			if(map.get(key) instanceof File){
				File file = (File) map.get(key);
				String fileName = (String) map.get(key);
				InputStream fileInputStream = new FileInputStream(file);
				
				dos.writeBytes(doubleDash + boundary + rn);
				dos.writeBytes("Content-Disposition: form-data; name=\"file\";filename=\""+ fileName +"\"" + rn);
				dos.writeBytes(rn);
				
				// 버퍼사이즈를 설정하여 buffer할당
				int bytesAvailable = fileInputStream.available(); 
				int maxBufferSize = 1024;
				int bufferSize = Math.min(bytesAvailable, maxBufferSize); 
				byte[] buffer = new byte[bufferSize];
				 
				// 스트림에 작성
				int bytesRead = fileInputStream.read(buffer, 0, bufferSize); 
				while (bytesRead > 0) 
				{ 
					// Upload file part(s) 
					dos.write(buffer, 0, bufferSize); 
					bytesAvailable = fileInputStream.available(); 
					bufferSize = Math.min(bytesAvailable, maxBufferSize); 
					bytesRead = fileInputStream.read(buffer, 0, bufferSize); 
				} 
				fileInputStream.close();
				dos.writeBytes(rn); 

			// File이 아니면 문자열이므로 아래처럼 ouputStream에 쓴다
			} else {
				// ex>
				// --**asdjk90234**\r\n
				// Content-Disposition: form-data; name=\"변수명1\"\r\n변수값1\r\n
				// --**asdjk90234**\r\n
				// Content-Disposition: form-data; name=\"변수명2\"\r\n변수값2\r\n
				// --**asdjk90234**\r\n
				// Content-Disposition: form-data; name=\"변수명3\"\r\n변수값3\r\n
				dos.writeBytes(doubleDash + boundary + rn);
				dos.writeBytes("Content-Disposition: form-data; name=\""+ key	+ "\""+ rn);
				dos.writeBytes(rn);
				dos.write(map.get(key).toString().getBytes(reqEncoding)); //한글처리
				dos.writeBytes(rn);
			}
			dos.writeBytes(doubleDash+boundary+doubleDash+rn);
			dos.flush();
		}
		//전송. 결과를 수신.
		InputStream is = conn.getInputStream(); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is, resEncoding)); // 캐릭터셋
		// 설정
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

	// POST 방식으로 연결하기
	public String HttpUrlPOST(Map<String, String> map, String reqEncoding, String resEncoding) throws Exception {
		URL url = new URL(this.url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST"); // 요청 방식을 설정 (default : GET)
		conn.setDoInput(true); // input을 사용하도록 설정 (default : true)
		conn.setDoOutput(true); // output을 사용하도록 설정 (default : false)
		conn.setConnectTimeout(60); // 타임아웃 시간 설정 (default : 무한대기)
		conn.connect();
		// OutputStream에 전달할 data 쓰기
		OutputStream os = conn.getOutputStream();

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, reqEncoding)); // 캐릭터셋
																								// 설정
		for (String key : map.keySet()) {
			writer.write(key + "=" + map.get(key) + "&"); // 요청 파라미터를 입력
		}
		// 스트림의 버퍼를 비워준다.
		writer.flush();
		writer.close();

		// 스트림을 닫아준다.
		os.close();
		// 응답결과 받아오기
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in, resEncoding)); // 캐릭터셋
																						// 설정
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
