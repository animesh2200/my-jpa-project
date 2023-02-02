package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.ExternalApi;
@Repository

public interface ExternalApiRepo extends JpaRepository<ExternalApi, Integer> { 

}
