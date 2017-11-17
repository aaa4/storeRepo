package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nyansus on 17.11.2017.
 */

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public void saveAll(List<Product> products){
        productRepository.save(products);
    }

    public void delete(long id){
        productRepository.delete(id);
    }

    public void deleteAll(){
        productRepository.deleteAll();
    }
}
