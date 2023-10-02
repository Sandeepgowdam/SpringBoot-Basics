package com.Api.RestApi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

//this annotation is to generate getters and setters which is provided by lombak
 //it will generate the constructor with all arguments
  //it will generate the constructor without any parameters 
public class Product {

	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	private Integer id;
	private String name;
	private Double price;
	
}


// lombok is dependencies provided by the springBoot to reduce the boiler plate by writing simple annotation