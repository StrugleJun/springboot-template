package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.services.TestServices;

@Controller
@RequestMapping(value = "/list")
public class TestController {

	
	@Autowired
	private TestServices ts;
	
	@RequestMapping("/test")
	@ResponseBody
	public String method() {
		ts.method();
		
		return "success";
	}
}
