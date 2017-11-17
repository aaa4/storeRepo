package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Nyansus on 16.11.2017.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    // List<Product> findAll();
     List<Product> findAll();


}
