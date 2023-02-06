package com.uditpatil.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		Integer resultCount = 0;
		
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else{
			resultCount = (Integer) session.getAttribute("count");
			resultCount++;
			session.setAttribute("count", resultCount);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}

}
