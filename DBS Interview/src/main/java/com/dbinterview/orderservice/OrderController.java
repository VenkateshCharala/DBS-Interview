package com.dbinterview.orderservice;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/orderservice")
@Controller
public class OrderController {
    @Autowired
    RestClientService restClientService;

    @RequestMapping(value = "/order/save", method = RequestMethod.GET)
    @ResponseBody
    public Order save() {
    	
    	List list = new ArrayList();
    	list.add("Pizza");
    	
        Order order = new Order();
        order.setCustomerName("Venkatesh");
        order.setOderItems(list);
        order.setOrderDate(new Date());
        order.setShippingAddress("Hyderabad");
        order.setTotal(246);
        
        OrderService.saveOrUpdate(order);
    	return restClientService.send(order.getId());
    }
    
    @GetMapping("/order/{id}")
	private Order getOrder(@PathVariable("id") int id) 
	{
	return OrderService.getOrderById(id);
	}
}
