package com.event.tester;

import java.util.Scanner;

import com.event.fruit.Alphonso;
import com.event.fruit.Apple;
import com.event.fruit.Fruit;
import com.event.fruit.Mango;
import com.event.fruit.Orange;

public class TestMaimFruit {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Put in size of your basket:");
		Fruit[] fruits = new Fruit[scn.nextInt()];
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("\nPlease select what to keep in your basket : \n" + "1.Select Apple 1 \n"
					+ "2.Select orange 2 \n" + "3.select any one mango press 3 \n"
					+ "Plese enter to check fruit name 4 \n" + "pleases enter to make jam/juice/pulp 5 \n"
					+ "Plese enter  6 to check your basket Contents:\n" + "Exit Done Shopping Press 0 \n");
			switch (scn.nextInt()) {
			case 1:
				System.out.println("selectec Apple");
				if (counter < fruits.length) {
					System.out.println("Enter Amount in weight");
					fruits[counter] = new Apple("Red", scn.nextInt(), "Apple", true);
					counter++;
					System.out.println("Fruit Added");
				} else {
					System.out.println("Basket Full Please Buy out or Exit!");
				}
				break;
			case 2:
				System.out.println("selected Orange");
				if (counter < fruits.length) {
					System.out.println("Enter Amount in weight");
					fruits[counter] = new Orange("Orange", scn.nextInt(), "ORANGE", true);
					counter++;
					System.out.println("Fruit Added");
				} else {
					System.out.println("Basket Full Please Buy out or Exit!");
				}
				break;
			case 3:
				System.out.println("selected Mango");
				System.out.println("Please enter type of mango : \n" + "1.Normal Mango \n" + "2.Alphonso Mango");
				int idx = scn.nextInt();
				if (idx == 1) {
					if (counter < fruits.length) {
						System.out.println("Enter Amount in weight");
						fruits[counter] = new Mango("Yellow", scn.nextInt(), "Mango", true);
						counter++;
						System.out.println("Fruit Added");
					} else {
						System.out.println("Basket Full Please Buy out or Exit!");
					}
				} else if (idx == 2) {
					if (counter < fruits.length) {
						fruits[counter] = new Alphonso("YellowRed", scn.nextInt(), "Mango", true);
						counter++;
						System.out.println("Fruit Added");
					} else {
						System.out.println("Basket Full Please Buy out or Exit!");
					}
				} else {
					System.out.println("Please select correct option");
				}

				break;
			case 4:
				System.out.println("Enter Fruit basket col no:");
				int index = scn.nextInt() - 1;
				if (index >= 0 && index < counter) {

					System.out.println(fruits[index]);
				} else {
					System.out.println("Invalid fruit no");
				}
				break;
			case 5:
				System.out.println("Enter Fruit basket col no:");
				index = scn.nextInt() - 1;
				if (index >= 0 && index < counter) {
					Fruit fruit = fruits[index];
					if (fruit instanceof Apple) {
						((Apple) fruit).jam();
					} else if (fruit instanceof Orange) {
						((Orange) fruit).juice();
					} else if (fruit instanceof Alphonso) {
						((Alphonso) fruit).pulp();
					} else {
						System.out.println("its a mango and its not alphonso");
					}
				} else {
					System.out.println("invalid fruit no");
				}
				break;
			case 6:
				System.out.println("Fruits in Basket-");
				// {s1,s2,s3,f1,f2,s4,s5.......}
				for (Fruit f : fruits)// f=fruits[0].....
				{
					if (f != null) {
						System.out.println(f);// f.toString() - run time polymorphism.
					}
				}
				break;
			case 7:
				System.out.println("Fruits in Basket- to set if its fresh or not");
				index = scn.nextInt() - 1;
				if (index >= 1 && index < counter) {
					System.out.println("False if stale and true if fresh : ");
					fruits[index].setIsFresh(scn.nextBoolean());
				} else {
					System.out.println("Invalid fruit idx!!");
				}
				break;
			case 0:
				exit = true;
				System.out.println("Basket Full Please Exitted!");
				break;
			default:
				System.out.println("please Enter correct code!");
				break;
			}
		}
		scn.close();
	}
}
