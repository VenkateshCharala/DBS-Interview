package com.dbinterview.orderitems;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/orderitem")
@Controller
public class OrderItemController {
    @RequestMapping(value = "/order/send", method = RequestMethod.POST)
    @ResponseBody
    public OrderItem send(@RequestBody OrderItem orderItem) {
        return orderItem;
    }
    
    @RequestMapping(value = "/orderitem/save", method = RequestMethod.GET)
    @ResponseBody
    public OrderItem save() {
    	
    	OrderItem orderItem = new OrderItem();
    	orderItem.setId(1);
    	orderItem.setProductCode("abcd");
    	orderItem.setProductName("Pizza");
    	orderItem.setQuantity("1");
    	
        OrderItemService.saveOrUpdate(orderItem);
    }
    
    @GetMapping("/orderitem/{id}")
	private OrderItem getOrder(@PathVariable("id") int id) 
	{
	return OrderItemService.getOrderById(id);
	}
}
