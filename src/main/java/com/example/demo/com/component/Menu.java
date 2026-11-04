package com.example.demo.com.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class Menu {
	@Value("${availableMenu}")
	private String availableMenu;
	
	@Override
	public String toString()
	{
		return "Menu: "+availableMenu;
	}
}
