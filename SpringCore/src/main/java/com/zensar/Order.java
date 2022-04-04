package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

    @Autowired
    private Item item;

    private String title;

    public Order() {
	super();
    }

    public Order(Item item, String title) {
	super();
	this.item = item;
	this.title = title;
    }

    public Order(Item item) {
	this.item = item;
	System.out.println("Inside order single parameterised constructor");
    }

    public void initaialize() {
	System.out.println("Inside initialize");
    }

    public void destroy() {
	System.out.println("Inside Destroy");
    }

    public Item getItem() {
	return item;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    @Override
    public String toString() {
	return title + " - " + item;
    }
}