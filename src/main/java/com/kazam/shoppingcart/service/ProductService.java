package com.kazam.shoppingcart.service;

import com.kazam.shoppingcart.model.Product;
import com.kazam.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productrepository;

public Product saveProduct(Product product){
     return productrepository.save(product);

}

}
