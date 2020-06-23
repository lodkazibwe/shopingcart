package com.kazam.shoppingcart.repository;

import com.kazam.shoppingcart.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
