package com.event.fruit;

public class Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.isFresh = isFresh;
		this.color = color;
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "\n------------------------\n" + "Fruit Details: \n" + "Name:" + name + "\nColor:" + color + "\nWeight:"
				+ weight + "\n(isFresh):" + isFresh;
	}

	public void taste() {
		System.out.println("Unknown Taste");
	}
	
	public void setIsFresh(boolean f) {
		this.isFresh = f;
	}
}
