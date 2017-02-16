package com.team4.project;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DbTestC {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private DbTestS dbTestS;
	
	@RequestMapping(value = "/11", method = RequestMethod.GET)
	public String test(Model model){
		logger.debug("test controller");
		List list = dbTestS.selectMedicineList();
		model.addAttribute("list", list);
		logger.debug(list.toString());
		return "test";
	}
}
