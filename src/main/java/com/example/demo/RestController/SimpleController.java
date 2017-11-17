package com.example.demo.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nyansus on 14.11.2017.
 */

//@RestController("/")
public class SimpleController {

   // @GetMapping("/mirror")
    public String mirror(@RequestParam(name = "key", defaultValue = "") String key){
        return key;
    }

   // @GetMapping("hello")
    public String hello(@RequestParam(name = "name", defaultValue = "admin") String name){
       if (name == null)
           return "";
       return "" + name.toUpperCase();
    }

   // @GetMapping("/view")
    public String myView(){
        return " this is the view";
    }
}
