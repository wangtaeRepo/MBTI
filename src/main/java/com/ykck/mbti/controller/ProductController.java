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
	
	@GetMapping("/Liverproducts")
	public String liverproducts(Model model) {
		List<Product> products = productService.getLiverList();
		System.out.println(products);
		model.addAttribute("products", products);
		return "product/service-list";
	}
	
	@GetMapping("/Exerciseproducts")
	public String exerciseproducts(Model model) {
		List<Product> products = productService.getExerciseList();
		model.addAttribute("products", products);
		return "product/service-list";
	}
	
	@GetMapping("/Brainproducts")
	public String brainproducts(Model model) {
		List<Product> products = productService.getBrainList();
		model.addAttribute("products", products);
		return "product/service-list";
	}
	
	@GetMapping("/Stomachproducts")
	public String stomachproducts(Model model) {
		List<Product> products = productService.getStomachList();
		model.addAttribute("products", products);
		return "product/service-list";
	}
	
	@GetMapping("/Eyeproducts")
	public String eyeproducts(Model model) {
		List<Product> products = productService.getEyeList();
		model.addAttribute("products", products);
		return "product/service-list";
	}
	
	@GetMapping("/Boneproducts")
	public String boneproducts(Model model) {
		List<Product> products = productService.getBoneList();
		model.addAttribute("products", products);
		return "product/service-list";
	}
	

}