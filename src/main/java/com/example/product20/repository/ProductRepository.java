package com.example.product20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.product20.model.Product20;

@Repository
public interface ProductRepository extends JpaRepository<Product20, Integer> {
}
