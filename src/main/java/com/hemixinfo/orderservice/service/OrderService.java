package com.hemixinfo.orderservice.service;

import java.util.List;
import java.util.Optional;

import com.hemixinfo.orderservice.entity.Order;

public interface OrderService {
	
	List<Order> getAllOrders();
	
	Optional<Order> getOrderById(Long id);
	
	Order createOrder(Order order);
}
