package com.biju.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.biju.demo.entity.Customer;
import com.biju.demo.entity.ExternalApi;
import com.biju.demo.entity.Orders;
import com.biju.demo.model.BoredApiResponse;
import com.biju.demo.service.ExternalApiService;

@RestController
public class ExternalApiController {

	private static Logger LOGGER = LoggerFactory.getLogger(ExternalApiController.class);

	@Value("${ext.api.url}")
	String apiUrl;
	@Autowired
	ExternalApiService externalApiService;

	@GetMapping(value = "/example1")
	private BoredApiResponse bookingData() {

		LOGGER.info("Call rest template to get data");

		RestTemplate restTemplate = new RestTemplate();
		BoredApiResponse responseEntityUser = restTemplate.getForObject(apiUrl, BoredApiResponse.class);

		LOGGER.info("Fetch the data");

		externalApiService.saveExternalApi(responseEntityUser);

		LOGGER.info("Data recived ");

		return responseEntityUser;

	}

	@RequestMapping(value = "/externalApiDelete", method = RequestMethod.DELETE)
	public void bookingDelete(@RequestParam int id) {
		externalApiService.deleteApi(id);
	}
	
}
