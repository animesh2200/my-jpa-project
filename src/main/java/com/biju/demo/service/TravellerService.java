package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Traveller;
import com.biju.demo.repo.TravellerRepo;

@Service
public class TravellerService {
	@Autowired
	TravellerRepo travellerRepo;
	
	public Traveller getTraveller(int id) {
		System.out.println(id);
		
		Optional<Traveller> traveller = travellerRepo.findById(id);
		if (traveller.isPresent())
			return (traveller.get());
		else 
			return null;
	}

}
