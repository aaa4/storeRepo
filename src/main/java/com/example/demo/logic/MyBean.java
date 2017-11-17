package com.example.demo.logic;



import com.example.demo.model.Product;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Nyansus on 17.11.2017.
 */
@Component
public class MyBean implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(MyBean.class);


    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... strings) throws Exception {
        List<Product> products = new ArrayList<>();
        logger.info("Hello. Here entry point of my cli code.");
        logger.info("Processing");
       // productService.deleteAll();
       // insertSome(400);
       // List<Product>  productsFromDb = productService.findAll();

      //  productsFromDb = productService.findAll();

       /* for (int i = 0; i < productsFromDb.size(); i++) {
            logger.info(i+" "+productsFromDb.get(i));
        }*/
       logger.info("Done");
    }


    public void insertSome(int numberOfProducts){
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < numberOfProducts; i++) {
            products.add( new ProductGenerator().getProduct());
        }
        productService.saveAll(products);
    }
}
