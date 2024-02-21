package com.example.parcial3_juliethbecerra.repositories;

import com.example.parcial3_juliethbecerra.entities.customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<customers, Integer> {
}

