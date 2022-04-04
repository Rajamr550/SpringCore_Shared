package com.zensar.emp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_Emp {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("emp_bean.xml");
	Employee emp = (Employee) iocContainer.getBean("emp1");
	System.out.println(emp);
    }

}
