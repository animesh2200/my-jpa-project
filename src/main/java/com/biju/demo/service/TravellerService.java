package com.biju.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Booking;
import com.biju.demo.entity.Traveller;
import com.biju.demo.model.TravellerBO;
import com.biju.demo.model.TravellerBO2;
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

	public String deleteTravellre(int id) {
		try {
			travellerRepo.deleteById(id);
			return "Success";
		} catch (Exception e) {
			return "Failed";
		}
	}

	public String saveTeaveller(Traveller traveller) {
		String msg = "Traveller data saved";
		try {
			travellerRepo.save(traveller);
		} catch (Exception e) {
			msg = "deny";
		}
		return msg;

	}

	public TravellerBO getOnlyFewTravellerDeatils(int id) {

		// creating a object of TravellerBO. This is empty object
		TravellerBO travellerBO = new TravellerBO();

		// get Traveller object from database using traveller id
		Optional<Traveller> traveller = travellerRepo.findById(id);

		if (traveller.isPresent()) {

			// setting data in object travellerBO from db object traveller
			// Buseness orented
			travellerBO.setAddressLine1(traveller.get().getAddressLine1());
			travellerBO.setCustomerName(traveller.get().getCustomerName());
			travellerBO.setPhoneNo(traveller.get().getPhoneNo());

			
			 List<Booking> tmp = traveller.get().getBookings(); for(int
			 i=0;i<tmp.size();i++) { System.out.println(tmp.get(i).getBookingNo()); }
			 

			return travellerBO;
		} else {
			return null;
		}
	}

	public TravellerBO2 getTravellerDetail(int id) {
		TravellerBO2 travellerBo2 = new TravellerBO2();
		Optional<Traveller> traveller = travellerRepo.findById(id);
		if (traveller.isPresent()) {
			travellerBo2.setAddressLine1(traveller.get().getAddressLine1());
			travellerBo2.setAddressLine2(traveller.get().getAddressLine2());
			travellerBo2.setCustomerName(traveller.get().getCustomerName());
			travellerBo2.setState(traveller.get().getState());
			return travellerBo2;
		} else {
			return null;

		}
	}
}
