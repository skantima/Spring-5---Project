package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloShopApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container
		Shop theShop = context.getBean("myShop", Shop.class);
		
		// call methods on the bean
		System.out.println(theShop.getDailyCount());
		
		// calling the new methods for offer - dependency injected 
		System.out.println(theShop.getDailyOffers());
		
		// close the context
		context.close();

	}

}
