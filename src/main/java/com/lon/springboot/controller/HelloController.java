package com.lon.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lon.springboot.entity.Student;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring Boot!";
	}
	@RequestMapping("/getStudent")
	public Student getStudent() {
		Student s = new Student();
		s.setId(1);
		s.setName("zhangs");
		s.setUsername("zhangsan");
		s.setPassword("123");
		return s;
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
