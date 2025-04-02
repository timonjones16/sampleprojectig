package com.sampleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/product")
	public String getProduct() {
		System.out.println("in service");
		return "PRoductDEtails";
	}
	
	public String getMsg(String s1) {
		String s;
		System.out.println("welcome");
		return "welcome";
	}
	void getDetails() {
		String name;
		double score;
		System.out.println("in getdetails....");
	}

}
