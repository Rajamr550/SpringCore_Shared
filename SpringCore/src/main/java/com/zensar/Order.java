package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {
    @Autowired
    @Qualifier("item1")
    private Item item;
    private String title;

    public Order() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside Default Order");
    }

    public Order(Item item, String title) {
	super();
	this.item = item;
	this.title = title;
    }

    public Order(Item item) {
	super();
	this.item = item;
    }

    public Item getItem() {

	return item;
    }

    public void setItem(Item item) {
	System.out.println("Inside setItem Order");
	this.item = item;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public void inilizeMethod() {
	System.out.println("Inilizting ::: ");
    }

    public void destroyMethod() {
	System.out.println("Distorying ::: ");
    }

    @Override
    public String toString() {
	return "Order [item=" + item + ", title=" + title + "]";
    }

}
