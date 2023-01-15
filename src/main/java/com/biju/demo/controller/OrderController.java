package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Orders;
import com.biju.demo.model.OrderDeleteRequest;
import com.biju.demo.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;

	
	@GetMapping(value = "/getOrder")
	public Orders getOrderData(@RequestParam int id) {		
		return orderService.getOrderById(id);
	}
	

	@RequestMapping(value = "/saveOrder", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveOrder(@RequestBody Orders order) {
		return orderService.saveOrder(order);
	}
	
	@RequestMapping(value = "/deleteOrder", method=RequestMethod.DELETE)
	public void deleteOrder(@RequestParam("orderId") int orderId) {		
		 orderService.deleteOrderById(orderId);
	}
	
	
	@PostMapping(value = "/deleteOrder2", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String deleteOrderData2(@RequestBody Orders orders) {
		 return orderService.deleteOrderById(orders.getOrderId());
	}
	
	
	@RequestMapping(value = "/deleteOrder3", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String deleteOrderData3 (@RequestBody OrderDeleteRequest orderDeleteRequest) {
		 return orderService.deleteOrderById(orderDeleteRequest.getOrderId());
	}

}
