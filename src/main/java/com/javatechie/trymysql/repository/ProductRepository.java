package com.javatechie.trymysql.repository;

import com.javatechie.trymysql.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    @Query(value="select price from product_tbl where name=?1",nativeQuery=true)
    double findprice(String name);
}
