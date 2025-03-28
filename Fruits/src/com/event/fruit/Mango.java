package com.event.fruit;

public class Mango extends Fruit {

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	public void taste() {
		System.out.println("Sweet");
	}
}