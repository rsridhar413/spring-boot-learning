package com.learning.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springboot.model.Product;
import com.learning.springboot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int productId) {
		return productRepository.findById(productId).orElse(new Product());
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

}
