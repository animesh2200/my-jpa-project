package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Booking;
import com.biju.demo.repo.BookingRepo;

@Service

public class BookingService {
	@Autowired
	BookingRepo bookingRepo;

	public Booking getBooking(int id) {
		System.out.println(id);
		Optional<Booking> booking = bookingRepo.findById(id);
		if (booking.isPresent())
			return (booking.get());
		else
			return null;
	}

	public String saveNewBooking(Booking booking) {
		String msg = "Booking Saved Successfulley";

		try {

			bookingRepo.save(booking);

		} catch (Exception e) {
			System.out.println("Exception occured:::" + e);
			msg = "Failed";
		}
		return msg;
	}

	public int deleteBooking(int id) {
		try
		{
		bookingRepo.deleteById(id);
		return 1;
		}
		catch (Exception e) {
		return 0;}
		
	}
}
