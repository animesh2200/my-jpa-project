package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Traveller;
import com.biju.demo.service.TravellerService;

@RestController
public class TravellerController {
	@Autowired
	TravellerService travellerService;
	
	@GetMapping (value="/traveller")
	public Traveller travellerData(@RequestParam int id ) {
		return travellerService.getTraveller(id);
	}

}
