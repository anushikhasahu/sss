package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exeption.ProductNotFoundException;
import com.app.model.Product;
import com.app.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository ;
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);	
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
	@Override
	public boolean deleteProduct(int productId) {
	productRepository.deleteById(productId);;
		return  false;
	}
	
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getProductByCategory(String category) throws ProductNotFoundException {
		List<Product> productList = productRepository.findProductByCategory(category);
		if(productList.isEmpty()) {
			throw new ProductNotFoundException("product not found");
		}
		return productList;
	}

	@Override
	public List<Product> getProductByType(String type) throws ProductNotFoundException {
		List<Product> productList = productRepository.findProductByType(type);
		if(productList.isEmpty()) {
			throw new ProductNotFoundException("product not found");
		}
		return productList;
	}

	@Override
	public List<Product> getProductByPsize(String psize) throws ProductNotFoundException {
		List<Product> productList = productRepository.findProductByPsize(psize);
		if(productList.isEmpty()) {
			throw new ProductNotFoundException("product not found");
		}
		return productList;
	}

	@Override
	public Product getByproductId(int productId) throws ProductNotFoundException {
		Product product= productRepository.findByproductId(productId);
		if(product==null)
			throw  new ProductNotFoundException("product not found");
		else
		return product;
	}

	



	

	

	

}
