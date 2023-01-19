package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@RequestMapping(value="/saveAgent", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveAgent(Agent agent) {
		return agentService.saveAgent(agent);
	}
	@RequestMapping(value="/deleteAgent", method=RequestMethod.DELETE)
	public String deleteAgent (int id) {
		return agentService.agentDelete(id);
	}

}
