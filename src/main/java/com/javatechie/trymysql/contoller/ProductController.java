package com.javatechie.trymysql.contoller;

import com.javatechie.trymysql.entity.Product;
import com.javatechie.trymysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return  service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return  service.saveProducts(products);
    }
    @GetMapping("/Products")
    public List<Product> findallProducts(){
        return service.getProducts();
    }
    @GetMapping("/Products/{id}")
    public Product findProductsbyid(@PathVariable int id){
        return service.getProductById(id);
    }
    //@GetMapping("/Products/{name}")
    //public Product findProductsbyname(@PathVariable String name){
      // return service.getProductByname(name);
    //}

}
