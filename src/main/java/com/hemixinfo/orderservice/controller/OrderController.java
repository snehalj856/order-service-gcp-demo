package com.hemixinfo.orderservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hemixinfo.orderservice.entity.Order;
import com.hemixinfo.orderservice.exception.OrderNotFoundException;
import com.hemixinfo.orderservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping(value = "/allorder", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@GetMapping(value = "/orders/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable(name = "id") Long orderId) {
		Optional<Order> orderById = orderService.getOrderById(orderId);
		if(orderById.isPresent()) {
			return new ResponseEntity<Order>(orderById.get(),HttpStatus.OK);
		} else {
			throw new OrderNotFoundException("Order Not Found With "+orderId);
		}
	}
	
	
	@PostMapping(value = "/orders",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Order createOrder(@RequestBody Order order) {
	   return orderService.createOrder(order);	
	}
	
}
