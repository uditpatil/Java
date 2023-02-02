package com.uditpatil.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("")
    public String firstName(@RequestParam(value="name", required=false) String searchQuery, 
    		@RequestParam(value="last_name", required=false) String lastNameQuery, 
    		@RequestParam(value="times", required=false) Integer noOfTimes) {
        if(searchQuery == null) {
        	return "Hello Human";
        }
        else if(lastNameQuery != null){
        	return "Hello " + searchQuery + " " + lastNameQuery;
        }
        else if(noOfTimes != null) {
        	String result ="";
        	for(int i = 0; i < noOfTimes; i++) {
        		result += ("Hello " + searchQuery +" ");
        	}
        	return result;
        }
        else {	
        	return "Hello " + searchQuery;
        }
    }

}
