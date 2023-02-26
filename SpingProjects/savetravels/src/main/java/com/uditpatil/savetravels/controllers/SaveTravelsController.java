package com.uditpatil.savetravels.controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;

import com.uditpatil.savetravels.models.SaveTravels;
import com.uditpatil.savetravels.services.SaveTravelsService;

@Controller
public class SaveTravelsController {
	@Autowired
	SaveTravelsService saveTravelsService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("saveTravels") SaveTravels saveTravels, Model model) {
		List<SaveTravels> saveTravelsList = saveTravelsService.allSaveTravels();
		model.addAttribute("saveTravelsList", saveTravelsList);
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("saveTravels") SaveTravels saveTravels, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<SaveTravels> saveTravelsList = saveTravelsService.allSaveTravels();
			model.addAttribute("saveTravelsList", saveTravelsList);
			return "index.jsp";
		} else {
			saveTravelsService.addExpense(saveTravels);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("saveTravels", saveTravelsService.findExpense(id));
		return "edit.jsp";
	}
	
	
	@PostMapping("/expenses/edit/{id}")
	public String udpate(
			@PathVariable("id") Long id,
			@Valid @ModelAttribute("saveTravels") SaveTravels saveTravels,
			BindingResult result, 
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("saveTravels", saveTravelsService.findExpense(id));
			return "redirect:/edit/{id}";
		} else {
			saveTravelsService.updateExpense(saveTravels);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("saveTravels", saveTravelsService.findExpense(id));
		return "show.jsp";
	}
	
	@RequestMapping("/expenses/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		SaveTravels saveTravels = saveTravelsService.findExpense(id);
		saveTravelsService.deleteExpense(id);
		return "redirect:/expenses";
	}
}
