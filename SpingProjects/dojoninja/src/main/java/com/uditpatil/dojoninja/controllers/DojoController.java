package com.uditpatil.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uditpatil.dojoninja.models.Dojo;
import com.uditpatil.dojoninja.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojoController {

	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/newDojo")
	public String createNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		else {
			dojoService.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@GetMapping("/{id}")
	public String dojoDetails(@PathVariable("id") Long id,Model model) {
		model.addAttribute("dojo", dojoService.getDojoById(id));
		return "details.jsp";
	}
}
