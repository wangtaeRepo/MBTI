package com.ykck.mbti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbti")
public class ProductController {
	
@Autowired

    @GetMapping("/product-detail")
    public String home(){
        
        return "product/product-detail";
  
    }

}