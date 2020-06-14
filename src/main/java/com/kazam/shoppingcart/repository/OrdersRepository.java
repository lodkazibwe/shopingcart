package com.kazam.shoppingcart.repository;

import com.kazam.shoppingcart.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
