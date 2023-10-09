package com.example.demo.Product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="PRODUCT-K")
public class Product {
	
	 @Id
	    String productName;
	    String companyName;
	    String type;
}
