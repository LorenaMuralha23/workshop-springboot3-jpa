package com.kingCode.Project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kingCode.Project1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
