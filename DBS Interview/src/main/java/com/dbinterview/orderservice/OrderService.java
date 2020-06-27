package com.dbinterview.orderservice;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public static void saveOrUpdate(Order order) 
	{
	OrderRepository.save(order);
	}
	
	public static Order getOrderById(int id) 
	{
	return OrderRepository.findById(id).get();
	}
}
