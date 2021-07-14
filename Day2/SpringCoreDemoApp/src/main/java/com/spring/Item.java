package com.spring;

public class Item {

	private String name;
	private Double value;
	
	
	
	public Item(String name, Double value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public Item() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", value=" + value + "]";
	}
	
	
}
