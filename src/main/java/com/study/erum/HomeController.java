package com.study.erum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
public class HomeController {
	
	@RequestMapping({"","/"})
	public String home () {
		log.info("Welcome home!");
		return "index";
	}
		
	
}
