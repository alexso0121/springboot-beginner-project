package com.javatechie.trymysql.contoller;

import com.javatechie.trymysql.Entity.Order;

import com.javatechie.trymysql.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/add/orders")
    public List<Order> addOrders(@RequestBody List<Order> orders){
        return  service.saveOrders(orders);
    }
    @GetMapping("/price")
    public double showordernames(){
        return service.orderprice();
    }

}
