package com.kingCode.Project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kingCode.Project1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
