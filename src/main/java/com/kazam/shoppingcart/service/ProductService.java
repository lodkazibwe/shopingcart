package com.kazam.shoppingcart.service;

import com.kazam.shoppingcart.model.Product;
import com.kazam.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productrepository;

public Product saveProduct(Product product){
     return productrepository.save(product);

}

    public Product getProduct(int id){
        return productrepository.findById(id).orElse(null);
    }
    public List<Product> getAllProducts(){
        return productrepository.findAll();
    }

    public Product updateProduct(Product product){
    return productrepository.save(product);
    }

    public void deleteProduct(int id){
         productrepository.deleteById(id);
    }

}
