package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Client")
public class Client {
    @Id
	private String id;
    
	private String name;
	@Field(name = "mail")
	private String email;
	
	private Product product;
	@Transient
	private double profit;

	public String getId() {
		return id;
	}

	public double getProfit() {
		System.out.println("git check"); 
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Location> getLoc() {
		return location;
	}

	public void setLoc(List<Location> loc) {
		this.location = loc;
	}

	private List<Location> location;
}
