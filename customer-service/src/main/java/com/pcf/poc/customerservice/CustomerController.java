/**
 * 
 */
package com.pcf.poc.customerservice;

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
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getById(@PathVariable("id") Integer id){
		return new ResponseEntity<> (customerService.getById(id), HttpStatus.OK);
		
	}
	
	@GetMapping("/customer-cart/{id}")
	public ResponseEntity<CustomerCartDetails> getCartDetailsById(@PathVariable("id") Integer id){
		Cart cart = restTemplate.getForObject("http://cart-service/api/cart/"+id, Cart.class);
		Customer customer = customerService.getById(id);
		CustomerCartDetails customerCartDetails = new CustomerCartDetails();
		customerCartDetails.setCustomer(customer);
		customerCartDetails.setCart(cart);
		return new ResponseEntity<> (customerCartDetails, HttpStatus.OK);
		
	}

}
