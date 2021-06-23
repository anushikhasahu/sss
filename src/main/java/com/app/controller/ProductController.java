package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exeption.ProductNotFoundException;
import com.app.model.Product;
import com.app.service.ProductService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("prod-api")
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@PostMapping("/products")
	ResponseEntity<String> addBook(Product product) {
		System.out.println(product);
		productService.addProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body("product added");
	}
	
	
	@PutMapping("/products")
	ResponseEntity<String> updateBook(Product product){
		System.out.println("put "+product);
		productService.updateProduct(product);
		return ResponseEntity.ok().body("product updated");
	}
	
	@DeleteMapping("/products/{id}")
	ResponseEntity<String>  deleteProduct(@PathVariable("productId")int productId){
		System.out.println("delete");
		productService.deleteProduct(productId);
		return ResponseEntity.ok().body("product deleted");
	}
	
	@GetMapping("/products")
	ResponseEntity<List<Product>> getAll(){
		List<Product> productList = productService.getAll();
		return ResponseEntity.ok(productList);
	}
	
	@GetMapping("/products-by-productId/{productId}")
	Product getByproductId(@PathVariable("productId") int productId) throws ProductNotFoundException{
		return productService.getByproductId(productId);
	}
	
	@GetMapping("/products-by-category/{category}")
	ResponseEntity<List<Product>> getBookByCategory(@PathVariable("category")String category) throws ProductNotFoundException{
		List<Product> productList = productService.getProductByCategory(category);
		return ResponseEntity.ok(productList);
	}
	
	
	@GetMapping("/products-by-type/{type}")
	ResponseEntity<List<Product>> getBookByType(@PathVariable("type")String type) throws ProductNotFoundException{
		List<Product> productList = productService.getProductByType(type);
		return ResponseEntity.ok(productList);
	}
	
	@GetMapping("/products-by-psize/{psize}")
	ResponseEntity<List<Product>> getBookByPsize(@PathVariable("psize")String psize) throws ProductNotFoundException{
		List<Product> productList = productService.getProductByPsize(psize);
		return ResponseEntity.ok(productList);
	}
		
	
	
}





//@PostMapping("/products")
//Product addProduct(@RequestBody Product product) {
//	return productService.addProduct(product);
//}



//@PutMapping("/products")
	//Product updateProduct(@RequestBody Product product) {
	//	return productService.updateProduct(product);
	//}


//@DeleteMapping("/products/{id}")
//boolean deleteProduct(@PathVariable("id") int productId) {
//	return productService.deleteProduct(productId);	
//}

//@GetMapping("/products")
//List<Product> getAll() {
//	return productService.getAll();
//}