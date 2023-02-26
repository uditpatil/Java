package com.uditpatil.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uditpatil.dojoninja.models.Dojo;
import com.uditpatil.dojoninja.models.Ninja;
import com.uditpatil.dojoninja.repositories.DojoRepository;
import com.uditpatil.dojoninja.repositories.NinjaRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Dojo getDojoById(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		else {
			return null;
		}
	}
	
	
}
