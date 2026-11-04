package com.example.demo;

import com.example.demo.com.component.FoodOrder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLabTaskDay01Application {

	private final FoodOrder foodOrder;

	SpringBootLabTaskDay01Application(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

	public static void main(String[] args) {
		ApplicationContext context =
		SpringApplication.run(SpringBootLabTaskDay01Application.class, args);
		FoodOrder bean = context.getBean(FoodOrder.class);
		System.out.println(bean);
		
	}

}
