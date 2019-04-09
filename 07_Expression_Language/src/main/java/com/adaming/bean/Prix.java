package com.adaming.bean;

import org.springframework.stereotype.Component;

@Component("prixBean")
public class Prix {
	
	public double getSpecialPrice() {
		return new Double(99.99);
	}
}
