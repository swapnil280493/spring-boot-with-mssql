package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		
		return service.getProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id ){
		
		return service.getProduct(id);
	}
	
	@PostMapping("/products")
	public List <Product> addProducts(@RequestBody List <Product> p ){
		
		return service.addProducts(p);
	}
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product p ){
		
		return service.addProduct(p);
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product p)
	{
		return service.updateProduct(p);
	}
}
