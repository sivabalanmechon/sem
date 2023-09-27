package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    
	@GetMapping(path="/get")
	public String index() {
		return "hello";
	}
}
