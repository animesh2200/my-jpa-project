package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.constant.MyConstant;
import com.biju.demo.entity.Customer;
import com.biju.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Value("${my.application.name}")
	private String abc;

	@GetMapping(value = "/customer")
	public Customer getCustomerData(@RequestParam int id) {

		System.out.println(MyConstant.GETCUSTOMERPATH);

		System.out.println(abc);

		return customerService.getCustomerById(id);
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveCustomerData(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
	public void deleteCustomer(@RequestParam("orderId") int id) {
		customerService.deleteOrderById(id);

	}

}
