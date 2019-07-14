package com.pcf.poc.cartservice;

import org.springframework.stereotype.Service;
/**
 * @author PK
 *
 */
@Service
public class CartService {

	public Cart getById(Integer id) {
		Cart cart = new Cart();
		cart.setId(id);
		cart.setItemName("Mobile");
		return cart;
	}
	
	

}
