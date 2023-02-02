package com.biju.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Booking;
import com.biju.demo.service.BookingService;

@RestController
public class BookingController {
	private static Logger LOGGER = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	BookingService bookingService;
	
	@GetMapping(value = "/booking")
	private Booking bookingData(@RequestParam int id) {
		Booking booking2 = bookingService.getBooking(id);
		return booking2;
	}

	@RequestMapping(value = "/bookingSave", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveBooking(@RequestBody Booking booking) {
		return bookingService.saveNewBooking(booking);
	}
	
	

	@RequestMapping(value = "/bookingDelete", method = RequestMethod.DELETE)
	public int bookingDelete(@RequestParam int id) {
		
		
		
		int show=bookingService.deleteBooking(id);
		System.out.println(show);
	return show;
		
	}

}
