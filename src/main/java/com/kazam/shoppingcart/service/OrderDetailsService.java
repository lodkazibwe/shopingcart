package com.kazam.shoppingcart.service;

import com.kazam.shoppingcart.model.OrderDetails;
import com.kazam.shoppingcart.model.Orders;
import com.kazam.shoppingcart.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderdetailsrepository;

    public OrderDetails addOrderDetail(OrderDetails orderdetails, int orderId){
        orderdetailsrepository.save(orderdetails);
        int newOrderId=orderdetails.getId();
        return updateAmount(newOrderId);
         //newOrder;

    }



    public OrderDetails updateAmount(int id){
        OrderDetails orderdetails=orderdetailsrepository.findById(id).orElse(null);
        double uprice =orderdetails.getProduct().getUnitPrice();
        int qtty=orderdetails.getQuantity();
        orderdetails.setAmount(id);
        return orderdetailsrepository.save(orderdetails);

    }

}
