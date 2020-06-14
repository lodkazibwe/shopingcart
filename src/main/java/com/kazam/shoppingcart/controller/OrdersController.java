package com.kazam.shoppingcart.controller;

import com.kazam.shoppingcart.model.Orders;
import com.kazam.shoppingcart.service.OrderDetailsService;
import com.kazam.shoppingcart.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersservice;

    @Autowired
    private OrderDetailsService orderdatailsservice;

    @PostMapping("/addOrders")
    public Orders saveOrders(@RequestBody Orders orders){

        return ordersservice.saveOrders(orders);
    }
}
