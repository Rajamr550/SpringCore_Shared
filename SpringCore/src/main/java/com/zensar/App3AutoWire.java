package com.zensar;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3AutoWire {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
	Order order = (Order) iocContainer.getBean("OrderBean");
	System.out.println("ORDER" + order);

    }

}
