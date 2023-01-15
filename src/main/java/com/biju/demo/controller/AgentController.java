package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Agent;
import com.biju.demo.service.AgentService;

@RestController
public class AgentController {
	@Autowired
	AgentService agentService;
	
	@GetMapping (value="/agent")
	public Agent agentData(@RequestParam int id) {
		return agentService.getAgent(id);
	}

}
