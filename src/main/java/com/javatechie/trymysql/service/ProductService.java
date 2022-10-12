package com.javatechie.trymysql.service;

import com.javatechie.trymysql.entity.Product;
import com.javatechie.trymysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository Repository;

    public Product saveProduct(Product product){
       return Repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return Repository.saveAll(products);
    }
    public List<Product> getProducts(){
        return Repository.findAll();
    }
    public Product getProductById(int id){
        return Repository.findById(id).orElse(null);
    }
    public Product getProductByname(String name){
        return Repository.findByname(name);
    }
    public String deleteProduct(int id){
        Repository.deleteById(id);
        return "Product rempved"+id;
    }
    public Product updateProduct(Product product){
        Product existingProduct= Repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return Repository.save(existingProduct);
    }
}
