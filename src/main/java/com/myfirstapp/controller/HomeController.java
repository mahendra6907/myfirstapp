package com.myfirstapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String display() {
		return "Hello World";
		
	}
	@RequestMapping("/vechical")
	public String Cars() {
		return "BMW,BENZ,HONDA,HYUNDI,BENTLI,TOYOTA";
		
	}

}
