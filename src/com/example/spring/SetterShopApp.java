package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterShopApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		//bean id must be copied from application config file for setter method
		ElectronicsShop theShop = context.getBean("myElectronicsShop", ElectronicsShop.class);
		
		// call methods on the bean
		System.out.println(theShop.getDailyCount());
		
		System.out.println(theShop.getDailyOffers());
		// close the context
		context.close();

	}

}
