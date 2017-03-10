package com.team4.project.hospital.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.team4.project.hospital.controller.HospitalController;

public class Interceptor extends HandlerInterceptorAdapter{
	private static final Logger logger = LoggerFactory.getLogger(HospitalController.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.debug("인터셉터 진입");
        try {
            //HOSPITALCODE이라는 세션key를 가진 정보가 널일경우 sessionCheck페이지로 이동
            if(request.getSession().getAttribute("HOSPITALCODE") == null ){
            	logger.debug("세션이 없다");
                //sessionCheck.jsp가 WEB-INF내에 있기때문에 response.sendRedirect를 할수 없다. 그래서 forward함
            	RequestDispatcher rd = request.getRequestDispatcher("/hospital/login");
            	rd.forward(request, response);
            	return false;
            }
            logger.debug("세션이 있네용~~");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //LIBRARYID 세션key 존재시 요청 페이지로 이동
        return true;
	}
}
