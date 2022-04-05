package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class example {

    @RequestMapping("/example")
    public String index() {
        return "index";
    }

    @RequestMapping("/example/image")
    public String indexImage() {
        return "Image";
    }
}