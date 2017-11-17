package com.example.demo.RestController;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Nyansus on 17.11.2017.
 */

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/main")
    public String productMain(Model model){
        model.addAttribute("products",productService.findAll());
        return "product_main";
    }
}
