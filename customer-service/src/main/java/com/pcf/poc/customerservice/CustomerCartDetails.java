package com.pcf.poc.customerservice;

public class CustomerCartDetails {
	private Customer customer;
	private Cart cart;
	public CustomerCartDetails() {
		
	}
	
	public CustomerCartDetails(Customer customer, Cart cart) {
		super();
		this.customer = customer;
		this.cart = cart;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
