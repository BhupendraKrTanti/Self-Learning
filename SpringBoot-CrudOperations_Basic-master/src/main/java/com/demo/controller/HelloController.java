package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/Bhupi")
	public String Hello() {
		return "Hello Bhupendra Kumar Tanti";
	}
	
}
