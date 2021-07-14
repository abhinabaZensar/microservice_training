package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {
	
	@Autowired
	@Qualifier(value="item_1")
	private Item item;
	private String title;
	
	public Order(Item item, String title) {
		super();
		this.item = item;
		this.title = title;
		System.out.println("Inside Order(item, title)");
	}
	
	public Order(Item item) {
		super();
		this.item = item;
		System.out.println("inside Order(item)");
	}

	@Override
	public String toString() {
		return "Order [item=" + item + ", title=" + title + "]";
	}

	public Order() {
		super();
		System.out.println("Inside order constructor");
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
