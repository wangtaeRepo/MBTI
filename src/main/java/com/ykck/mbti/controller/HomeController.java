<<<<<<< HEAD
package com.ykck.mbti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbti") //localhost:8888/mbti/
public class HomeController {

    @GetMapping("/home")
    public String home(){
        
        return "index";
    }

    @GetMapping("/login")
    public String login(){

        return "member/login";
    }

    @GetMapping("/cart")
    public String cart(){

        return "cart/cart";
    }

    @GetMapping("/survey")
    public String survey(){

        return "survey";
    }
    
}
=======
package com.ykck.mbti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbti")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        
        return "index";
    }

    @GetMapping("/login")
    public String login(){

        return "member/login";
    }

    @GetMapping("/cart")
    public String cart(){

        return "cart/cart";
    }

    @GetMapping("/survey")
    public String survey(){

        return "survey";
    }
    
}
>>>>>>> 5e120bf5b4b11935d49fc4b209c21c03db2bca57
