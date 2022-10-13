package com.javatechie.trymysql.contoller;

import com.javatechie.trymysql.entity.Product;
import com.javatechie.trymysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
//@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/say")
    public String say() {
        return "dfgdgs";
    }


    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    //@PostMapping
    //public Product addProduct(@RequestBody Product product){
       // return  service.saveProduct(product);
    //}
   // @PostMapping("/addProducts")
    //public List<Product> addProducts(@RequestBody List<Product> products){
       // return  service.saveProducts(products);
   // }
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
    @PostMapping("/product")
    public void registernewproduct(@RequestBody Product product){
        service.addNewProduct(product);
    }


}
