package com.hemixinfo.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hemixinfo.orderservice.entity.Order;
import com.hemixinfo.orderservice.repository.OrderRepository;

@SpringBootApplication
public class OrderServiceApplication implements CommandLineRunner {

	@Autowired
	OrderRepository orderRepo;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Order> findAll = orderRepo.findAll();
		if (findAll.size() == 0) {
			orderRepo.save(new Order(1l, "hemant", "1024", "tesla"));
			orderRepo.save(new Order(2l, "kuldeep", "4096", "nexon"));
		}
	}

}
