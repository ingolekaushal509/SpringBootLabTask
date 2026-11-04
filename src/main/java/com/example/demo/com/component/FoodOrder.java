package com.example.demo.com.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodOrder {
	
	@Autowired
	private Restaurent resturent;
	@Autowired
	private Menu menu;
	@Autowired
	private DeliveryPartner deliveryPartner;
	
//	public FoodOrder(Restaurent resturent,Menu menu,DeliveryPartner deliveryPartner)
//	{
//		this.resturent=resturent;
//		this.menu=menu;
//		this.deliveryPartner=deliveryPartner;
//		
//	}
	
	public String toString()
	{
		return "Welcome to Online Food Delivery System"+"\n"+resturent+"\n"+menu+"\n"+deliveryPartner+"\n"+"Your food order is successfully placed!";
	}
	
}
