package com.spring.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
	public HelloController1() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/hello1")
	public String redirect() {
		System.out.println("in redirect");
		return "viewpage1";
	}
}
