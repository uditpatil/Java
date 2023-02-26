package com.uditpatil.dojoninja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uditpatil.dojoninja.models.Dojo;
import com.uditpatil.dojoninja.models.Ninja;
import com.uditpatil.dojoninja.services.DojoService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	@Autowired
	private DojoService dojoService;

	@GetMapping("/new")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> everyDojos = dojoService.allDojos();
		model.addAttribute("everyDojos", everyDojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/newNinja")
	public String createNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> everyDojos = dojoService.allDojos();
			model.addAttribute("everyDojos", everyDojos);
			return "newNinja.jsp";
		} 
		else {
			dojoService.createNinja(ninja);
			System.out.println(ninja.getDojo());
			return "redirect:/dojos/" + ninja.getDojo().getId();
		}
	}
}
