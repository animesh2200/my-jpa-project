package com.biju.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Orders;


@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {

	

	
}
