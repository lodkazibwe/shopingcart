package com.kazam.shoppingcart.repository;

import com.kazam.shoppingcart.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
