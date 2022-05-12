package com.hemixinfo.orderservice.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hemixinfo.orderservice.entity.Order;
import com.hemixinfo.orderservice.repository.OrderRepository;
import com.hemixinfo.orderservice.service.OrderService;

@Component
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Optional<Order> getOrderById(Long id) {		
		return orderRepository.findById(id);
	}

	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}
}
