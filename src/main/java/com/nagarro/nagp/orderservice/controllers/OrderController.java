package com.nagarro.nagp.orderservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.orderservice.model.Order;
import com.nagarro.nagp.orderservice.model.UserOrders;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	List<Order> list = new ArrayList<Order>();
	
	OrderController(){
		list.add(new Order(1,250,"30-03-2020"));
		list.add(new Order(2,800,"31-03-2020"));
		
	}
	
	@GetMapping(value = "/{userId}")
	public UserOrders getOrderForUser(@PathVariable String userId) {
		return new UserOrders(list);
	}
}
