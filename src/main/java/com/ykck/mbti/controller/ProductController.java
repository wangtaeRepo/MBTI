package com.ykck.mbti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ykck.mbti.dto.Product;
import com.ykck.mbti.service.ProductService;

@Controller
@RequestMapping("/mbti")
public class ProductController {

	 @Autowired
	 ProductService productService;

	@GetMapping("/product-detail")
	public String home() {

		return "product/product-detail";

	}

	@GetMapping("/products")
	public String products(Model model) {
		List<Product> products = productService.getProductList();
		model.addAttribute("products", products);
		return "product/product";
	}

}