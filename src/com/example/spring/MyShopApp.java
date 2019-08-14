package com.example.spring;

public class MyShopApp {

	public static void main(String[] args) {
		
		// create the object
		Shop theShop = new FlowerShop();
		
		// use the object
		System.out.println(theShop.getDailyCount());
	}

}
