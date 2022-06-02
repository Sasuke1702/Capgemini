package com.example.demomanytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	private int items_id;
	private String items_desc;
	private int items_cost;
	
	public int getItems_id() {
		return items_id;
	}

	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}

	public String getItems_desc() {
		return items_desc;
	}

	public void setItems_desc(String items_desc) {
		this.items_desc = items_desc;
	}

	public int getItems_cost() {
		return items_cost;
	}

	public void setItems_cost(int items_cost) {
		this.items_cost = items_cost;
	}

	public Cart getCart_obj() {
		return Cart_obj;
	}

	public void setCart_obj(Cart cart_obj) {
		Cart_obj = cart_obj;
	}

	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart Cart_obj;
	
	public Items()
	{
		
	}

	public Items(int items_id, String items_desc, int items_cost, Cart Cart_obj) {
		super();
		this.items_id = items_id;
		this.items_desc = items_desc;
		this.items_cost = items_cost;
		this.Cart_obj = Cart_obj;
	}
	

}
