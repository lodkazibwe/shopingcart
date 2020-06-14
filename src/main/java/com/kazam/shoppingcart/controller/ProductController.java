package com.kazam.shoppingcart.controller;

import com.kazam.shoppingcart.model.Product;
import com.kazam.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

@Autowired
    ProductService productservice;
@PostMapping ("/addProduct")
public Product saveProduct (@RequestBody Product product){
      return productservice.saveProduct(product);
}
}
