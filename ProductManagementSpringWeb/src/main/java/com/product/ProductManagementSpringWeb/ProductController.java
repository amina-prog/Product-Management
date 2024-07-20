package com.product.ProductManagementSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    //for products requests
    @GetMapping("/products")
     public ArrayList<Product> getAllProducts(){
           return service.getAllProducts();
     }
    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name){
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }
}
