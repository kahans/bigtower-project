package com.team4.project.government.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.team4.project.government.dto.GoDoctor;

public class Interceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(Interceptor.class);
	
	@Autowired
	private SqlSessionTemplate sql; 

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		// 정부 인터셉터
		logger.debug("정부 인터셉터 들어옴");
		String doctorId = request.getParameter("doctorId");
		logger.debug("doctorId:"+doctorId);
		GoDoctor goDoctor = sql.selectOne("government.doctorIdCheck", doctorId);
		if (goDoctor==null) {
			logger.debug("code없음 ");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.write("권한이없습니다.");
			return false;
		}
		logger.debug("goDoctor:"+goDoctor);
		logger.debug("code있음 ");
		return true;
	}
}
