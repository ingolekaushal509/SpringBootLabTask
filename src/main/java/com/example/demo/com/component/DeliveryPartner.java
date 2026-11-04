package com.example.demo.com.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class DeliveryPartner {
	@Value("${DeliveryPartnerName}")
	private String DeliveryPartnerName;
	
	@Override
	public String toString()
	{
		return "Delivery Partner: "+DeliveryPartnerName;
	}
}
