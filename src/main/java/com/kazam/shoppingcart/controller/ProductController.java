package com.kazam.shoppingcart.controller;

import com.kazam.shoppingcart.model.Product;
import com.kazam.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

@Autowired
    ProductService productservice;
@PostMapping ("/addProduct")
public Product saveProduct (@RequestBody Product product){

    return productservice.saveProduct(product);
}
@GetMapping("/getProduct/{id}")
public Product getProduct(@PathVariable int id){
return productservice.getProduct(id);
}
@GetMapping("/getProducts")
    public List<Product> getAllProducts(){
        return productservice.getAllProducts();
    }

@PutMapping("/updateProduct/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable int id){
       return  productservice.updateProduct(product, id);
    }
@DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int id){
        productservice.deleteProduct(id);
    }


}



