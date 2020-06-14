package com.kazam.shoppingcart.controller;

import com.kazam.shoppingcart.model.OrderDetails;
import com.kazam.shoppingcart.model.Orders;
import com.kazam.shoppingcart.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderdetailsservice;



}
