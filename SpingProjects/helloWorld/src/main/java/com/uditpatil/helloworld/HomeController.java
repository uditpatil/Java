package com.uditpatil.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("")
	public String index() {
		return "Hello World!";
	}
	
	@RequestMapping("/new")
	public String newWord() {
		return "This is new World!";
	
	}
	
	@RequestMapping("/goodbye")
	public String goodbye() {
		return "Goodbye Fellow!";

	}

}
