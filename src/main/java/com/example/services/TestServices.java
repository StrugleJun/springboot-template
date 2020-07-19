package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TestDao;

@Service
public class TestServices {
	
	@Autowired
	private TestDao td;
	
	public void method() {
		System.out.println("Test Services");
		td.method();
	}

}
