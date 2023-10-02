package com.Api.RestApi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // to represent this class as restController we are using this annotation to perform the http protocol operations
public class ApiRestController {

	@PostMapping("/saveProduct") // by post method we are sending the date so we are using this annotation
	public String saveProduct(@RequestBody  Product p) { //we are sending the data in form of json so Requstbody will accept that and convert to object
	
		// here we can write the logic when we are interacting with DB
		
		System.out.println(p);
		return "product saved";
		
	}
	
	@GetMapping("/product/{pid}")// by get method by sending the id in url we can obtain the required data
	public Product getProduct(@PathVariable Integer pid) { // we are sending the id in url path so we using this annotation
		Product p = null;
		if(pid==100) {
			 p = new Product(100,"mouse",500.00);   //if id is matching we will create new and obtain because we are hardcoding so we need to create if we are using db then we can write our own code
		}else if(pid==101){
			 p = new Product(101,"keyboard",500.00);
		}
		return p;
	}
	
	@GetMapping("/allProducts")
	public List<Product> getProducts(){
	   Product	 p =new Product(100,"mouse",500.00);  // here we will insert first and obtain when we are using db at that time we able to obtain all data from db but now we re hard coding everytheing
		Product p2 =new Product(101,"keyboard",500.00);
		List<Product> asList = Arrays.asList(p,p2);  
		return asList;
	}
	
	
}
