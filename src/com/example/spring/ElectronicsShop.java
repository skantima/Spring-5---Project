package com.example.spring;

public class ElectronicsShop implements Shop {

	private Offers offers;
	
	// create a no-arg constructor
	public ElectronicsShop() {
		System.out.println("ElectronicShop: inside the no arg constructor");
	}
	
	// setter method created for setter injection
	public void setOffers(Offers offers) {
		System.out.println("ElectronicsShop: inside setter method - setOffers");
		this.offers = offers;
	}

	@Override
	public String getDailyCount() {
		return "We have 100 of every item in our stocks";
	}

	@Override
	public String getDailyOffers() {
		return "Take an Iphone on purchase over $1000. " + offers.getDailyOffers();
	}

}
