package com.app.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.exeption.ProductNotFoundException;
import com.app.model.Product;


public interface ProductService {

	
	Product addProduct(Product product);
	Product updateProduct(Product product);
	boolean deleteProduct(int productId);
	Product getByproductId(int productId) throws ProductNotFoundException;
	
	List<Product> getAll();
	//List<Product> getProductById(int productId) throws ProductNotFoundException;
	List<Product> getProductByCategory(String category) throws ProductNotFoundException;
	List<Product> getProductByType(String type) throws ProductNotFoundException;
	List<Product> getProductByPsize(String psize) throws ProductNotFoundException;

	
}
