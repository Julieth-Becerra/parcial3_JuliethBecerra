package com.example.parcial3_juliethbecerra.repositories;

import com.example.parcial3_juliethbecerra.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product, Integer> {
}
