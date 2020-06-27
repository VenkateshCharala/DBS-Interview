package com.dbinterview.orderitems;

import org.springframework.stereotype.Service;


@Service
public class OrderItemService {
	
	public static void saveOrUpdate(OrderItem orderItem) 
	{
	OrderItemRepository.save(orderItem);
	}
	
	public static OrderItem getOrderById(int id) 
	{
	return OrderItemRepository.findById(id).get();
	}

}
