package com.kazam.shoppingcart.controller;

import com.kazam.shoppingcart.model.OrderDetails;
import com.kazam.shoppingcart.model.Orders;
import com.kazam.shoppingcart.service.OrdersService;
import com.kazam.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersservice;

    @Autowired
    private ProductService productservice;

    @PostMapping("/addOrder")
    public String saveOrders(Orders order){

        calculateTotals(order);
        ordersservice.saveOrders(order);
        return "redirect:/getOrder/"+order.getId();

    }

    @GetMapping("/getOrder/{id}")
    public String getOrder(@PathVariable int id, Model model){
        Orders order=ordersservice.getOrder(id);
        model.addAttribute("order", order);
        return "Order";
    }

    @GetMapping("/getOrderByAddress/{customerAddress}")
    public List<Orders> getOrdersByAddress(@PathVariable String customerAddress){
        return ordersservice.getOrdersByAddress(customerAddress);
    }

    public void calculateTotals(Orders order){
        List<OrderDetails> newDetails =order.getOrderdetails();
        double total=0;
        for(OrderDetails detail : newDetails ){
            int pid=detail.getProduct().getId();
            int qtty=detail.getQuantity();
            double unitPrice=productservice.getProduct(pid).getUnitPrice();
            String name=productservice.getProduct(pid).getName();
            int quantity=productservice.getProduct(pid).getQuantity();
            double amount=unitPrice*qtty;
            detail.setAmount(amount);
            detail.getProduct().setName(name);
            detail.getProduct().setQuantity(quantity);
            detail.getProduct().setUnitPrice(unitPrice);

            total+=amount;
        }
        order.setOrderdetails(newDetails);
        order.setTotalAmount(total);
    }

}
