package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.model.Product;
import com.app.service.ProductService;

@SpringBootApplication
public class StreetStyleStoreAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StreetStyleStoreAppApplication.class, args);
	}
	
  @Autowired
    ProductService productService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

	/*
		Product product1 = new Product("Set in purple",500,"Two Set","Daily wears","M","Comfortable sets","assets/images/set1.jpeg",4);
	    productService.addProduct(product1);

      Product product2 = new Product("Set in black",1200,"Two Set","Daily wears","S","Comfortable sets","assets/images/set2.jpeg",4);
      productService.addProduct(product2);
	
      Product product3 = new Product("Set in blue",700,"Two Set","Daily wears","M","Comfortable sets","assets/images/set2.jpeg",5);
      productService.addProduct(product3);
	*/
		
     /*   Product product1 = new Product("cute dress",1500,"Dress","Party","S","beautiful dress","assets/images/dress1.jpeg",4);
	   productService.addProduct(product1);
		    
	   Product product2 = new Product("cute dress",1200,"Dress","Party","S","beautiful dress","assets/images/dress2.jpeg",4);
	   productService.addProduct(product2);
		
		
		
		
		   Product product2 = new Product("Cute tshirt",1500,"top","casual","L","Daily wear tops","assets/images/top4.jpeg",5);
		   productService.addProduct(product2);
		   Product product3 = new Product("Cute tshirt",500,"top","casual","S","Daily wear tops","assets/images/top3.jpeg",4);
		   productService.addProduct(product3);
		
		
		*/
		
	/*	
		Product product1 = new Product("Cute top",500,"top","casual","S","Daily wear tops","assets/images/top1.jpeg",4);
		   productService.addProduct(product1);
		   Product product2 = new Product("Cute top",500,"top","casual","L","Daily wear tops","assets/images/top2.jpeg",5);
		   productService.addProduct(product2);
		   Product product3 = new Product("Cute top",500,"top","casual","M","Daily wear tops","assets/images/top3.jpeg",4);
		   productService.addProduct(product3);

*/
		
		
		
		
		
/*

		productService.getAll()
		.stream().forEach((product)->{
			System.out.println(product.getProdName()+"\t");
			System.out.println(product.getCategory()+"\t");
			System.out.println(product.getPsize()+"\t");
			System.out.println(product.getType()+"\t");
			System.out.println(product.getPrice()+"\t");
		});

*/
		
	}

}
