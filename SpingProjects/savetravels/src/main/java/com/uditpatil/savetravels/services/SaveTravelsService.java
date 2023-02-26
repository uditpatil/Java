package com.uditpatil.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.uditpatil.savetravels.models.SaveTravels;
import com.uditpatil.savetravels.repositories.SaveTravelsRepository;

@Service
public class SaveTravelsService {
	private final SaveTravelsRepository saveTravelsRepository;
	
	public SaveTravelsService(SaveTravelsRepository saveTravelsRepository) {
		this.saveTravelsRepository = saveTravelsRepository;
	}
	
	public List<SaveTravels> allSaveTravels(){
		return saveTravelsRepository.findAll();
	}
	
	public SaveTravels addExpense(SaveTravels saveTravels) {
		return saveTravelsRepository.save(saveTravels);
	}
	
	public SaveTravels findExpense(Long id) {
		Optional<SaveTravels> optionalExpense = saveTravelsRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	public SaveTravels updateExpense(SaveTravels saveTravels) {
		return saveTravelsRepository.save(saveTravels);
	}
	
	public void deleteExpense(Long id) {
		Optional<SaveTravels> optionalExpense = saveTravelsRepository.findById(id);
		if(optionalExpense.isPresent()) {
			saveTravelsRepository.deleteById(id);
		}
	}
	 
}
