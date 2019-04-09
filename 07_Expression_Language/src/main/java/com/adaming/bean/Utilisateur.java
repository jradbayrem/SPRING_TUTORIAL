package com.adaming.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author INTI0261
 *
 */
@Component("userAnnBean")
public class Utilisateur {

	@Value("#{'nomane'.toUpperCase()}")
	private String name;

	@Value("#{prixBean.getSpecialPrice()}")
	private double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Utilisateur [name=" + name + ", amount=" + amount + "]";
}
}