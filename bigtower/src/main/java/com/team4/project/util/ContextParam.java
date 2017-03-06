package com.team4.project.util;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

@Component
public class ContextParam implements ServletContextAware{

	public static ServletContext context;
	@Override
	public void setServletContext(ServletContext context) {
		this.context = context;
	}

}
