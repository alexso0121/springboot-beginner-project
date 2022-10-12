package com.javatechie.trymysql.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    private int id;
    private String name;
    private int quantity;
    private double price;

}
