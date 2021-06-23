package com.app.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name= "ssspro")
@NoArgsConstructor
@ToString
@Data
public class Product {

	@Column(name = "prodname")
	private String prodName;
	
	@Id
	@GeneratedValue(generator = "pro_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "pro_seq", sequenceName = "produ_seq", allocationSize = 1, initialValue = 1)
	@Column(name = "prod_id")
	private Integer productId;

	private Integer price;
	
	private String type;
	
	private String category;
	
	private String psize;
	
	@Column(length=20)
	private String description;
	
	@Column(name = "imagepath")
	private String imagePath;
	
	private int rating;

	public Product(String prodName, Integer price, String type, String category, String psize, String description,
			String imagePath, int rating) {
		super();
		this.prodName = prodName;
		this.price = price;
		this.type = type;
		this.category = category;
		this.psize = psize;
		this.description = description;
		this.imagePath = imagePath;
		this.rating = rating;
	}

	
	
	

	
	
}
