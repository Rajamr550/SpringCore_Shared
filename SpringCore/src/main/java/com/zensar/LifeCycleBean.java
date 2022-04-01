package com.zensar;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleBean implements ApplicationContextAware, InitializingBean, DisposableBean {

	private double price;

	public LifeCycleBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside LifeCycleBean Constructor");
	}

	public LifeCycleBean(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Inside price set : " + this.price);
	}

	@Override
	public String toString() {

		return "LifeCycleBean [price=" + price + "]";
	}

	public void inilizer() {
		System.out.println("inilizer()  ");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub

		System.out.println("The Annotation ::: " + applicationContext);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()  : " + this.price);

	}



	public void MyDestroy() {
		System.out.println("inside destory() ");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destory() ");
	}
	
	public void checkPull()  {
		// TODO Auto-generated method stub
		System.out.println("Checking Verified");
	}
	
	
	public void checkPull1()  {
		// TODO Auto-generated method stub
		System.out.println("pull 2 merge ...etc");
	}
	
	

}
