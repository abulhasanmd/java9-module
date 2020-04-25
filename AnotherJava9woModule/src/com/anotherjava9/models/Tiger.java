package com.anotherjava9.models;

public class Tiger {
	private String name;
	private int legs;
	public Tiger() {
		super();
	}
	public Tiger(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}
	@Override
	public String toString() {
		return "Tiger [name=" + name + ", legs=" + legs + "]";
	}
	
}
