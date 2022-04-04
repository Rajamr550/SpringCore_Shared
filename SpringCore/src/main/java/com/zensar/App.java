package com.zensar;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	double totalPrice = 0;
	/**
	 * First Approach ----------------------------------");
	 */
	AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
	/*
	 * Order order = (Order)iocContainer.getBean("OrderBean");
	 * System.out.print(order);
	 */
//	LifeCycleBean lifeCycleBean = (LifeCycleBean) iocContainer.getBean("LifeCycleBean");
//	System.out.print(lifeCycleBean);

	String[] str = iocContainer.getBeanDefinitionNames();
	for (int i = 0; i < str.length; i++) {
	    if (str[i].contains("OrderBean")) {
		Order order = (Order) iocContainer.getBean(str[i]);
		System.out.println("The Order of Item " + i + 1 + order);
		totalPrice += order.getItem().getPrice();
	    }
	}
	System.out.println("Total Price of All Orders : " + totalPrice);

//	  /** Second Approach ----------------------------------");
//	  
//	  System.out.print("Second Approach ----------------------------------");
//	  totalPrice = 0; String[] srt = iocContainer.getBeanNamesForType(Order.class);
//	  for() { Order order = (Order)iocContainer.getBean(srt[i]);
//	  System.out.println("The Order of Item " + i+1 + order); totalPrice +=
//	  order.getItem().getPrice();
//	  
    }

//	String[] string = iocContainer.getBeanNamesForType(Order.class);
//
//	System.out.println("str lent " + string.length);
//	for (int i = 0; i < string.length; i++) {
//	    Order order = (Order) iocContainer.getBean(string[i]);
//	    System.out.println(" " + order);
//	    System.out.println("total order prixze raja " + order.getItem().getPrice());
//	    System.out.println("each pruchase " + order.getTitle());
//	    System.out.println(i);
//	}

//	iocContainer.registerShutdownHook();

}
