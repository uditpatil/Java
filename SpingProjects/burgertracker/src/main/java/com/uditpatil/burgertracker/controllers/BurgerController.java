package com.uditpatil.burgertracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.uditpatil.burgertracker.models.Burger;
import com.uditpatil.burgertracker.services.BurgerService;

@Controller
public class BurgerController {
	
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/")
	public String burger(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurger();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	
	@PostMapping("/burgers")
	public String newBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurger();
			model.addAttribute("burgers", burgers);
			return "index.jsp";
		}
		burgerService.addBurger(burger);
		return "redirect:/";
	}
	
	@GetMapping("/burgers/{id}/edit")
	public String edit(@PathVariable("id") long id, @ModelAttribute("burger") Burger burger, Model model) {
		 
		model.addAttribute("burger", burgerService.findBurger(id));
		return "edit.jsp";
	}
	
	@PostMapping("/burgers/{id}/edit")
	public String updateBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "edit.jsp";
		} else {
			burgerService.updateBurger(burger);
			return "redirect:/";
		}
		
		
	}
	
}
