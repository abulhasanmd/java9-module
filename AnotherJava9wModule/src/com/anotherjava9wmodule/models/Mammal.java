package com.anotherjava9wmodule.models;

public class Mammal {
	private String name;
	private boolean isAmphibian;
	
	public Mammal() {
		this.name="unnamed";
		this.isAmphibian=false;
	}
	public Mammal(String name, boolean isAmphibian) {
		super();
		this.name = name;
		this.isAmphibian = isAmphibian;
	}
	@Override
	public String toString() {
		return "Mammal [name=" + name + ", isAmphibian=" + isAmphibian + "]";
	}
	
	
}
