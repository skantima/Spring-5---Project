package com.example.spring;

public class FruitShop implements Shop {

	/*
	 * Constructor injection for dependency injection
	 */
	
	// define a private field for the dependency
	private Offers offers;
	
	// define a constructor for dependency injection
	
	public FruitShop(Offers theOffers) {
		offers = theOffers;
	}
	
	@Override
	public String getDailyCount() {
		return "From Fruit Shop: We have 30 of each fruits";
	}

	@Override
	public String getDailyOffers() {
	
		// use the offers to get an offer
		
		return "Get 30% off on selected products" + offers.getDailyOffers ();
	}
}
