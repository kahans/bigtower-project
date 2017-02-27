package com.team4.project.government.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(Interceptor.class);
 @Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	// 정부 인터셉터
	 logger.debug("정부 인터셉터 들어옴");
	 logger.debug("세션정보 확인 FLAG : "+request.getSession().getAttribute("FLAG"));
	 logger.debug("세션정보 확인 GOCITIZENNO : "+request.getSession().getAttribute("GOCITIZENNO"));
	 logger.debug("세션정보 확인 GOCITIZENID : "+request.getSession().getAttribute("GOCITIZENID"));
	 logger.debug("세션정보 확인 GOCITIZENNAME : "+request.getSession().getAttribute("GOCITIZENNAME"));
	 
	 if(request.getSession().getAttribute("FLAG")==null){
		logger.debug("로그인 되어있지 않음 FLAG 확인 : "+request.getSession().getAttribute("FLAG"));
		response.sendRedirect(request.getContextPath()+"/government/login");
		 return false; 
	 }
	 logger.debug("로그인 됨 FLAG 확인 : "+request.getSession().getAttribute("FLAG"));
	return true;
 }
}
