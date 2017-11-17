package com.example.demo.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Nyansus on 18.11.2017.
 */

@Controller
public class HelloController {




    @GetMapping("/hello")
    public String hello(Model model){

        return "hello";
    }
}
