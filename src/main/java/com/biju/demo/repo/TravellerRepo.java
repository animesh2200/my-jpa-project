package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Traveller;

@Repository
public interface TravellerRepo extends JpaRepository<Traveller, Integer> {

}
