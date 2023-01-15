package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Agent;

@Repository
public interface AgentRepo extends JpaRepository<Agent, Integer> {

}
