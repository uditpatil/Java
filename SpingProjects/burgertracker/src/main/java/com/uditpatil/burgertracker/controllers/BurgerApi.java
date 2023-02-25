package com.uditpatil.burgertracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uditpatil.burgertracker.models.Burger;
import com.uditpatil.burgertracker.services.BurgerService;


@RestController
public class BurgerApi {
	private final BurgerService burgerService;
	public BurgerApi(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	@RequestMapping("/api/")
    public List<Burger> index() {
        return burgerService.allBurger();
    }
    
    @RequestMapping(value="/api/burgers", method=RequestMethod.POST)
    public Burger create(@RequestParam(value="burgerName") String burgerName, @RequestParam(value="restaurantName") String restaurantName, @RequestParam(value="rating") Integer rating, @RequestParam(value="notes") String notes) {
        Burger burger = new Burger(burgerName, restaurantName, rating, notes);
        return burgerService.addBurger(burger);
    }
	
}
