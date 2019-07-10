package com.lti.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:port/spring-mvc/hello.lti
@Controller
public class HelloController {
	
	@RequestMapping("/hello.lti")
	public String handle(Map<String,Object> model) {		//serve the purpose of model
		model.put("message", "Welcome to Spring MVC");
		return "hello.jsp";
	}

}
