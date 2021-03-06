package com.kazam.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
//jpa
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double unitPrice;
    private int quantity;
}


