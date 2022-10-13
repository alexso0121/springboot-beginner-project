package com.javatechie.trymysql;

import com.javatechie.trymysql.entity.Product;
import com.javatechie.trymysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {


    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
        return args -> {
            Product product=new  Product(3,"toys",10,1234

            );
            Product product3=new  Product(4,"food",10,344

            );
            repository.saveAll(List.of(product3,product));
        };
    }
}
