/**
 * 
 */
package com.pcf.poc.cartservice;

/**
 * @author PK
 *
 */
public class Cart {
    private Integer id;
    private String itemName;
   
    public Cart() {}
   
	public Cart(Integer id, String itemName) {
		super();
		this.id = id;
		this.itemName = itemName;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
   
	

}
