package com.zensar;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
	int totalPrice = 0;
//IoC container provided by Spring framework
	AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
//	Item item = (Item) iocContainer.getBean("itemBean");
//	Order order = (Order) iocContainer.getBean("orderBean");
	Map<String, Order> beans = iocContainer.getBeansOfType(Order.class);

	for (Order price : beans.values()) {
	    totalPrice += price.getItem().getPrice();
	}
	System.out.println("Total Price : " + totalPrice);
    }
}