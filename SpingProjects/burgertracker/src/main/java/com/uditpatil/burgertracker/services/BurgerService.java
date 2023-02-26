package com.uditpatil.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.uditpatil.burgertracker.models.Burger;
import com.uditpatil.burgertracker.repositories.BurgerRepository;


@Service
public class BurgerService {
	private final BurgerRepository burgerRepository;
		
	public BurgerService(BurgerRepository burgerRepository) {
		
		this.burgerRepository = burgerRepository;
	}
	
	public List<Burger> allBurger() {
		return burgerRepository.findAll();
	}
	
	public Burger addBurger(Burger burger) {
		 
		return burgerRepository.save(burger);
	}
	
	public Burger findBurger(long id) {
		Optional<Burger> optionalBurger = burgerRepository.findById(id);
		if(optionalBurger.isPresent()) {
			return optionalBurger.get();
		} else {
			return null;
		}
	}
	
	public Burger updateBurger(Burger burger) {
		return burgerRepository.save(burger);
	}

}
