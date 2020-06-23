package com.kazam.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Product product;

    private int quantity;
    private double amount;

}

