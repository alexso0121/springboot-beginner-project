package com.javatechie.trymysql.repository;

import com.javatechie.trymysql.Entity.Order;
import com.javatechie.trymysql.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Query(value="Select product_name from orders",nativeQuery = true)
    List<String> findallordername();

    @Query(value="Select quantity from orders Where product_name=?1",nativeQuery = true)
    Double findquatitybyname(String product_name);


}
