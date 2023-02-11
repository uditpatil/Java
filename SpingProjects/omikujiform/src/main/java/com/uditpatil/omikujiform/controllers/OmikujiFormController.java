package com.uditpatil.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiFormController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		
		String resultForm = (String) session.getAttribute("resultOmikujiForm");
		model.addAttribute("resultForm", resultForm);
		
		return "showOmikuji.jsp";
	}
	
	@PostMapping("/submitForm")
	public String submitForm(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("livingThing") String livingthing,
			@RequestParam("message") String message,
			HttpSession session
			) {
		
		String resultOmikujiForm = String.format("In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", number, city, person, hobby, livingthing, message);
		session.setAttribute("resultOmikujiForm", resultOmikujiForm);
		
		return "redirect:/omikuji/show";
	}


}