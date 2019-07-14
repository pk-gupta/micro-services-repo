package com.pcf.poc.cartservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author PK
 *
 */
@RestController
@RequestMapping("/api/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id") Integer id){
		return new ResponseEntity<>(cartService.getById(id), HttpStatus.OK);
	}
	
	@GetMapping("/cart-product/{id}")
	public ResponseEntity<CartProductDetails> getCartDetailsById(@PathVariable("id") Integer id){
		Product product = restTemplate.getForObject("http://product-service/api/product/"+id, Product.class);
		Cart cart = cartService.getById(id);
		CartProductDetails cartProductDetails = new CartProductDetails();
		cartProductDetails.setCart(cart);
		cartProductDetails.setProduct(product);
		return new ResponseEntity<> (cartProductDetails, HttpStatus.OK);
		
	}

}
