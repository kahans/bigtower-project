package com.team4.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "government-index";
	}
	@RequestMapping(value = "/ho", method = RequestMethod.GET)
	public String ho(Model model) {
	
		
		return "hospital-index";
	}
	@RequestMapping(value = "/icons", method = RequestMethod.GET)
	public String icons(Model model) {
				
		return "icons";
	}
	
}
