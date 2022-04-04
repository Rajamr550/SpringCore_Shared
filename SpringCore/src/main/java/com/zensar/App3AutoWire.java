package com.zensar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App3AutoWire {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	AbstractApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
	Order order = (Order) iocContainer.getBean("orderBean");
	System.out.println("Order: " + order);

    }

}