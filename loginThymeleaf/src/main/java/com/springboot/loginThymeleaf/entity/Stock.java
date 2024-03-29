package com.springboot.loginThymeleaf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String item;
    private int price;
    private int quantity;
   
	public String getItem() {
		return item;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

	/*public Stock(Long id, String item, int price, int quantity) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}*/


	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Stock(Long id, String item, int price, int quantity) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	
	}
       
}
