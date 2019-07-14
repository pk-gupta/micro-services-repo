package com.pcf.poc.cartservice;

public class CartProductDetails {
	private Cart cart;
	private Product product;
	
	public CartProductDetails() {
		
	}

	public CartProductDetails(Cart cart, Product product) {
		super();
		this.cart = cart;
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
