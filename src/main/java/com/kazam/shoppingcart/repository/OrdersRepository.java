package com.kazam.shoppingcart.repository;

import com.kazam.shoppingcart.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
        List<Orders> findByCustomerAddress(String customerAddress);
}
