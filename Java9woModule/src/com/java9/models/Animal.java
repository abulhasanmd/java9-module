package com.java9.models;

public class Animal {
	private String name;
	private int legs;
	private int hands;
	public Animal() {
		super();
	}
	public Animal(String name, int legs, int hands) {
		super();
		this.name = name;
		this.legs = legs;
		this.hands = hands;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", legs=" + legs + ", hands=" + hands + "]";
	}
	
}
