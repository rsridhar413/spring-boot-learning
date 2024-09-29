package com.learning.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.model.Product;
import com.learning.springboot.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productservice;

	@GetMapping("/all")
//	@RequestMapping(value = "", method = RequestMethod.GET) //another type of mapping
	public List<Product> getProducts() {
		return productservice.getProducts();
	}

	@GetMapping("/{productId}")
	public Product getProductById(@PathVariable int productId) {
		return productservice.getProductById(productId);
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Product product) {
		productservice.addProduct(product);
	}
	
	@PutMapping("/update")
	public void updateProduct(@RequestBody Product product) {
		productservice.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		productservice.deleteProduct(productId);
	}
	
}
