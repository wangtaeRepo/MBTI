
package com.ykck.mbti.controller;

import java.util.List;

import com.ykck.mbti.dto.Category;
import com.ykck.mbti.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbti") //localhost:8888/mbti/
public class HomeController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/home")
    public String home(){
        
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "member/login";
    }
    
    @GetMapping("/sign")
    public String sign(){
        return "member/sign";
    }   

    @GetMapping("/cart")
    public String cart(){

        return "cart/cart";
    }

    @GetMapping("/survey")
    public String survey(Model model){
        List<Category> categories = categoryService.getCategoryList();
        model.addAttribute("categories", categories);
        return "type/survey";
    }
    
    @GetMapping("/products")
    public String products(){

        return "product/service-list";
    }
    
}

