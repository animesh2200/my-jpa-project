package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Customer;
import com.biju.demo.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	public Customer getCustomerById(int id) {

		System.out.println(id);

		Optional<Customer> customer = customerRepo.findById(id);

		if (customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}
	}

	public String saveCustomer(Customer customer) {

		String msg = "Success";

		try {
			customerRepo.save(customer);
		} catch (Exception e) {
			System.out.println("Exception occured:::" + e);
			msg = "Failed";
		}
		return msg;

	}

	public String deleteOrderById(int id) {
		try {
			customerRepo.deleteById(id);
			return "Success";
		} catch (Exception e) {
			System.out.println("Exception occured while deleting record::::" + e);
			return "Failed";
		}

	}
}
