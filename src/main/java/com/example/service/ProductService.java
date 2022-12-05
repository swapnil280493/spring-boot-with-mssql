package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repo.productRepo;

@Service
public class ProductService {

	@Autowired
	productRepo repo;
	
  public List<Product> getProducts(){
	  
	  return repo.findAll();
  }
  
  public Product getProduct(int id) {
	  
	  return repo.findById(id).orElse(new Product());
  }
  
  public Product addProduct(Product p) {
	  return repo.save(p);
  }
  
  public List<Product> addProducts(List <Product> p) {
	  return repo.saveAll(p);
  }
  
  public String deleteProduct(int id)
  {
	  repo.deleteById(id);
	  return "Product deleted successfully";
  }
	  
  public Product updateProduct(Product p)
  {
	  Product p1 = repo.findById(p.getId()).orElse(new Product());
	  p1.setName(p.getName());
	  p1.setPrice(p.getPrice());
	  p1.setQuantity(p.getQuantity());
	  return repo.save(p1);
  }
	
}
