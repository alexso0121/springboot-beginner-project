package com.javatechie.trymysql.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue

    private int id;
    private String product_name;
    private int quantity;}

