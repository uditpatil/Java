package com.uditpatil.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uditpatil.savetravels.models.SaveTravels;




public interface SaveTravelsRepository extends CrudRepository<SaveTravels, Long> {

	List<SaveTravels> findAll();
}
