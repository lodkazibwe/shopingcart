package com.kazam.shoppingcart.controller;

import com.kazam.shoppingcart.model.Product;
import com.kazam.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

@Autowired
    ProductService productservice;
@PostMapping ("/addProduct")
public String saveProduct ( Product product){

    productservice.saveProduct(product);
    return "redirect:/getProducts";

}

@GetMapping("/getProduct/{id}")
@ResponseBody
public Product getProduct(@PathVariable int id){
    return productservice.getProduct(id);
}

@RequestMapping("/getProducts")
    public String getAllProducts(Model model){
    List<Product> products= productservice.getAllProducts();
    model.addAttribute("products",products);
    return "Products";
    }

@PostMapping("/updateProduct")
    public String updateProduct(Product product){
       productservice.updateProduct(product);
    return "redirect:/getProducts";
    }

@RequestMapping(value="/deleteProduct/{id}", method={RequestMethod.DELETE, RequestMethod.GET})
    public String deleteProduct(@PathVariable int id){

    productservice.deleteProduct(id);
    return "redirect:/getProducts";
    }

}



