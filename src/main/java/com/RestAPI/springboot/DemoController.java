package com.RestAPI.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/Welcome")
	public String welcome() {
		return "Welcome to springboot";
	}
}
