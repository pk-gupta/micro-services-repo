package com.pcf.poc.cartservice;

public class Product {
	private Integer id;
	private String name;
	private Double price;
	private String brandName;
	
	public Product(){
		
	}

	public Product(Integer id, String name, Double price, String brandName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brandName = brandName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
	
	

}
