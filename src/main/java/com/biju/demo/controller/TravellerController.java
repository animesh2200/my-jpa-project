package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Traveller;
import com.biju.demo.model.TravellerBO;
import com.biju.demo.model.TravellerBO2;
import com.biju.demo.repo.TravellerRepo;
import com.biju.demo.service.TravellerService;

@RestController
public class TravellerController {
	@Autowired
	TravellerService travellerService;

	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/traveller")
	public Traveller travellerData(@RequestParam int id) {
		return travellerService.getTraveller(id);
	}

	@RequestMapping(value = "/deleteTraveller", method = RequestMethod.DELETE)
	public void deleteTraveller(@RequestParam int id) {
		travellerService.deleteTravellre(id);
	}

	@RequestMapping(value="/saveTraveller",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void savedTraveller(@RequestBody Traveller traveller) {
		travellerService.saveTeaveller(traveller);
	}
	
	@GetMapping(value = "/travellerV2")
	public TravellerBO travellerDataV2(@RequestParam int id) {
		return travellerService.getOnlyFewTravellerDeatils(id);
	}
	@GetMapping(value = "/travellerV3")
	public TravellerBO2 travellerDataV3(@RequestParam int id) {
		return travellerService.getTravellerDetail(id);
	}

}
