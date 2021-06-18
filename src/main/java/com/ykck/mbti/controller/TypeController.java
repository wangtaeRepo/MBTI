package com.ykck.mbti.controller;

import java.util.List;

import com.ykck.mbti.dto.Category;
import com.ykck.mbti.dto.Product;
import com.ykck.mbti.dto.Type;
import com.ykck.mbti.service.CategoryService;
import com.ykck.mbti.service.ProductService;
import com.ykck.mbti.service.TypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mbti")
public class TypeController {
    
    @Autowired
    TypeService typeService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;

    @GetMapping("/type-result")
    public String getTypeByCount(@RequestParam("first_category_id") int first_category_id,@RequestParam("second_category_id") int second_category_id,@RequestParam("third_category_id") int third_category_id, Model model){

        Type type = typeService.getTypeByCount(first_category_id,second_category_id,third_category_id);

        Category firstCategory = categoryService.getCategoryByFirst(first_category_id);

        List<Product> products = productService.getProductByCategoryId(first_category_id);

        System.out.println(type.getType_name());
        model.addAttribute("type", type);
        model.addAttribute("firstCategory", firstCategory);
        model.addAttribute("products", products);

        return "type/type-result";
    }
}
