package com.example.demo.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nyansus on 17.11.2017.
 */
//@RestController("/v1")
public class SimpleRestView {

    //@GetMapping("/view")
    public String myView(){
        return " this is the view";
    }
}
