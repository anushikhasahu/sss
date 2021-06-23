package com.app.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.exeption.ProductNotFoundException;
import com.app.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	List<Product> findProductByCategory(String category)throws ProductNotFoundException;
	List<Product> findProductByType(String type)throws ProductNotFoundException;
	List<Product> findProductByPsize(String psize)throws ProductNotFoundException;
	
	Product findByproductId(int productId) throws ProductNotFoundException;

	
	
	//List<Product> findProductById(int productId)throws ProductNotFoundException;
	//List<Product> findProductByCategoryAndType(String category,String type) throws ProductNotFoundException;
}
