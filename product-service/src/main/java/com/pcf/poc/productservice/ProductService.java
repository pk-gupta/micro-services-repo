package com.pcf.poc.productservice;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public Product getById(Integer id) {
		Product product = new Product();
		product.setId(id);
		product.setName("Moto G5 plus");
		product.setPrice(16999.00);
		product.setBrandName("Motorola");
		return product;
	}

}
