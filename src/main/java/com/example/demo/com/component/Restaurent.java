package com.example.demo.com.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class Restaurent {
	
	@Value("${restaurentName}")
	private String restaurentName;
	
	@Override
	public String toString()
	{
		return "Restaurent: "+restaurentName;
	}
	
	
}
