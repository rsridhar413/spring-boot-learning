package com.learning.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.springboot.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
