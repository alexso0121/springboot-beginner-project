package com.javatechie.trymysql.contoller;

import com.javatechie.trymysql.entity.Product;
import com.javatechie.trymysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
import java.util.Optional;


@RestController
//@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService service;




    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
   // @PostMapping
    //public void addnewproduct(@RequestBody Product products){
        //service.addNewProduct(products);
        //System.out.println(products);
    //}


    @PostMapping
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
    @GetMapping("/Product/{id}")
    public Product findProductsByid(@PathVariable int id){
        return service.getProductById(id);
    }
    //url cannot be the same must be different(cannot Product/id,Product/name)
    @GetMapping("/Productname/{name}")
    public Product findProductsByName(@PathVariable String name){
       return service.getProductByname(name);
    }
    //@PostMapping("/product")
    //public void registernewproduct(@RequestBody Product product){
        //service.addNewProduct(product);
    //}
    @PutMapping("/update/{id}")
    public  Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id ){
        return service.deleteProduct(id);
    }
}
