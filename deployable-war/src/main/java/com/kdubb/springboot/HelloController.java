package com.kdubb.springboot;

import java.time.Instant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		Instant now = Instant.now();
		
		// let�s pass some variables to the view script
		model.addAttribute("wisdom", "Java 8 [" + now + "]");
		
		// renders /WEB-INF/views/hello.jsp
		return "hello";
	}
}