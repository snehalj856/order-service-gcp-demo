package com.hemixinfo.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemixinfo.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
