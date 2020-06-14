package com.kazam.shoppingcart.service;

import com.kazam.shoppingcart.model.Orders;
import com.kazam.shoppingcart.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersrepository;

    public Orders saveOrders(Orders orders){

        return ordersrepository.save(orders);
    }

    public Orders getOrder(int id){
        return ordersrepository.findById(id).orElse(null);
    }

    public List<Orders> getOrdersByAddress(String customerAddress){
        return ordersrepository.findByCustomerAddress(customerAddress);
    }
}

