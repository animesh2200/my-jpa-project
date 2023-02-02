package com.biju.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.ExternalApi;
import com.biju.demo.model.BoredApiResponse;
import com.biju.demo.repo.ExternalApiRepo;

@Service

public class ExternalApiService {

	private static Logger LOGGER = LoggerFactory.getLogger(ExternalApiService.class);

	@Autowired
	ExternalApiRepo externalApiRepo;

	public void saveExternalApi(BoredApiResponse boredApiResponse) {

		try {

			LOGGER.info("setting values :");

			ExternalApi externalApi = new ExternalApi();

			externalApi.setAccessibility(boredApiResponse.getAccessibility());
			externalApi.setKey(Integer.parseInt(boredApiResponse.getKey()));
			externalApi.setActivity(boredApiResponse.getActivity());
			externalApi.setLink(boredApiResponse.getLink());
			externalApi.setParticipants(boredApiResponse.getParticipants());
			externalApi.setPrice(boredApiResponse.getPrice());
			externalApi.setType(boredApiResponse.getType());

			LOGGER.info("Save the data");

			externalApiRepo.save(externalApi);

			LOGGER.info("Save complite");

		} catch (Exception e) {

			LOGGER.error("Error saving data:" + e);

		}
	}

	public String deleteApi(int id) {
		try {
			externalApiRepo.deleteById(id);
			return "Delete Sucessfully";
		} catch (Exception e) {
			return "Unsucessfully";

		}

	}

}
