package com.felipe.fraudguard.dto;

import java.math.BigDecimal;

public class TransactionRequestDTO {

	private BigDecimal amount;
	private String location;
	private String device;
	
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
		
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDevice() {
		return device;
	}
	
	public void setDevice(String device) {
		this.device = device;
	}
}
