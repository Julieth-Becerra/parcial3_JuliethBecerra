package com.example.parcial3_juliethbecerra.repositories;

import com.example.parcial3_juliethbecerra.entities.product;
import com.example.parcial3_juliethbecerra.entities.sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<sale, Integer> {

    List<product> findProductsById(Integer saleId);
}
