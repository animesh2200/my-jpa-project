package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Agent;
import com.biju.demo.repo.AgentRepo;

@Service

public class AgentService {

	@Autowired
	AgentRepo agentRepo;

	public Agent getAgent(int id) {
		System.out.println(id);
		Optional<Agent> agent = agentRepo.findById(id);

		if (agent.isPresent())
			return (agent.get());

		else
			return null;
	}

	public String saveAgent(Agent agent) {
		try {
			agentRepo.save(agent);
			return "Sucessfull";
		} catch (Exception e) {
			return "failed";
		}
	}

	public String agentDelete(int id) {
		try {
			agentRepo.deleteById(id);
			return "Delete sucessfull";
		} catch (Exception e) {
			return "failed";
		}

	}
}
