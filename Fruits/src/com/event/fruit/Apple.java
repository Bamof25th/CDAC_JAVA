package com.event.fruit;

public class Apple extends Fruit {

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	public void taste() {
		System.out.println("Sweet & Sour");
	}
	
    public void jam() {
    	System.out.println( super.toString()+ "\n Making Jam! \n");
	}

	
}
