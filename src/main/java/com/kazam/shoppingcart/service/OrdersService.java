package com.kazam.shoppingcart.service;

import com.kazam.shoppingcart.model.Orders;
import com.kazam.shoppingcart.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersrepository;

    public Orders saveOrders(Orders orders){
        return ordersrepository.save(orders);
    }
}
