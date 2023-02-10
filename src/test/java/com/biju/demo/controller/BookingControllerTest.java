package com.biju.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.biju.demo.entity.Booking;

@SpringBootTest
public class BookingControllerTest {
	
	@Autowired
	BookingController bookingController;
	
	
	
	@Test
	public void testGetCustomer() {
		
		int id = 10002;
		Booking booking = bookingController.bookingData(id);
		assertThat(booking).isNotNull();
		
	}
	
	
	@Test
	public void testGetCustomer2() {
		
		int id = 10402;
		Booking booking = bookingController.bookingData(id);
		assertThat(booking).isNull();
		
	}

}
