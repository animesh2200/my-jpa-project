package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Orders;
import com.biju.demo.repo.OrdersRepo;

@Service
public class OrderService {

	@Autowired
	OrdersRepo orderRepo;

	public Orders getOrderById(int id) {

		Optional<Orders> orders = orderRepo.findById(id);

		if (orders.isPresent())
			return orders.get();
		else
			return null;
	}
	
	public String deleteOrderById(int id) {
		try {
			orderRepo.deleteById(id);
			return "Success";
		} catch (Exception e) {
			System.out.println("Exception occured while deleting record::::"+e);
			return "Failed";
		}		
	}

	public String saveOrder(Orders order) {
		String msg = "Success";

		try {
			
			orderRepo.save(order);

		} catch (Exception e) {
			System.out.println("Exception occured:::" + e);
			msg = "Failed";
		}

		return msg;

	}

}
