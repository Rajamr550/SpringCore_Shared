package com.zensar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean(name = "itemBean")
    public Item getitemBean() {
	Item item = new Item("Laptop", 70000.0);
	return item;
    }

    @Bean(name = "itemBean2")
    @Primary
    public Item getitemBean2() {
	Item item = new Item("Desktop", 70000.0);
	return item;
    }

    @Bean(name = "orderBean")
    public Order getOrderBean() {
	Order order = new Order();
	order.setTitle("It order");
	return order;
    }

}