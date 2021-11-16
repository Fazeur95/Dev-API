package com.ynov.demoapi.service;

import org.springframework.stereotype.Service;

import com.ynov.demoapi.model.Product;


@Service
public class ProductService {
	
	public  Product createNewRandomProduct(){
		
		Product p = new Product();
		
		p.setName("Produit");
		p.setCost(10);
		p.setDescription("Description of the product");		
		
		return p;	
	}
}
