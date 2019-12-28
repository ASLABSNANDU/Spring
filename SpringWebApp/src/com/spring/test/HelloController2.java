package com.spring.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
	public HelloController2() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/hello2")
	public String redirect() {
		System.out.println("in redirect");
		return "viewpage2";
	}
}
