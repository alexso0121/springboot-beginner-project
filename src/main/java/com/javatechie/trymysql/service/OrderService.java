package com.javatechie.trymysql.service;

import com.javatechie.trymysql.Entity.Order;
import com.javatechie.trymysql.repository.OrderRepository;
import com.javatechie.trymysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository Repository;

    @Autowired
    private ProductService productservice;


    public List<Order> saveOrders(List<Order> order) {
        return Repository.saveAll(order);
    }

    public double orderprice(){
        double total_price=0;
        List<String> list= Repository.findallordername();
        for(String product_name:list){
            double single_price=productservice.findpricebyname(product_name);
            total_price+=single_price*Repository.findquatitybyname(product_name);
        }
        return total_price;
    }
}
