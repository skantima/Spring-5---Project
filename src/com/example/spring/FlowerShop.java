package com.example.spring;

public class FlowerShop implements Shop {

	private Offers offers;
	
	public FlowerShop() {
		
	}
	public FlowerShop(Offers offers) {
		
		this.offers = offers;
	}

	@Override
	public String getDailyCount() {
		
		return "From Flower Shop: There are 4 count of roses, lillies and Tulips";
	}

	@Override
	public String getDailyOffers() {
		
		return "Get 50% off on all clearance products and " + offers.getDailyOffers();
	}

}
