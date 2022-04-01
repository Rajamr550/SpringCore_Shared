package com.zensar_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("BeansClassChat.xml");
		ChatApplication chatApplication = (ChatApplication)iocContainer.getBean(ChatApplication.class);
		
		System.out.println(chatApplication);

	}

}
