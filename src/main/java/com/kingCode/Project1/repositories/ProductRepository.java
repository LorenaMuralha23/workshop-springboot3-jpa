package com.kingCode.Project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kingCode.Project1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
