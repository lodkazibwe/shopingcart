package com.kazam.shoppingcart.repository;

import com.kazam.shoppingcart.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
        List<Orders> findByCustomerAddress(String customerAddress);
}
