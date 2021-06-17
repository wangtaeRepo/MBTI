package com.ykck.mbti.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ykck.mbti.dto.Category;
import com.ykck.mbti.dto.Product;
import com.ykck.mbti.service.CategoryService;
import com.ykck.mbti.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    
    @Autowired
    @Resource(name="categoryService")
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategoryList(){

        return categoryService.getCategoryList();
    }
    
    @Autowired
    @Resource(name="productService")
    ProductService productService;
    
    @GetMapping("/products")
    public List<Product> getProductsList(){

        return productService.getProductList();
    }

    @PostMapping("/decide-type")
    @Transactional
    public @ResponseBody ArrayList<Map<Integer,Integer>> getType (ArrayList<Map<Integer,Integer>>  map){
        System.out.println(map.get(1));
        return map;
    }


}
