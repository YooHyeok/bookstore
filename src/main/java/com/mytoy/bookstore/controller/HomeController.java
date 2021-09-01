package com.mytoy.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "index2";
    }

    @GetMapping("/store")
    public String store(){
        return "store/list";
    }

}
