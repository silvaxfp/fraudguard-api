package com.felipe.fraudguard.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionResponseDTO {
	
		private Long id;
		private BigDecimal amount;
		private String location;
		private String device;
		private String status;
		private LocalDateTime createdAt;
		
		public Long getId () {
			return id;
		}
		
		public void setId (Long id) {
			this.id = id;
		}
		
		public BigDecimal getAmount () {
			return amount;
		}
		
		public void setAmount (BigDecimal amount) {
			this.amount = amount;
		}
		
		public String getLocation () {
			return location;
		}
		
		public void setLocation (String location) {
			this.location = location;
		}
		
		public String getDevice () {
			return device;
		}
		
		public void setDevice (String device) {
			this.device = device;
		}
		
		public String getStatus () {
			return status;
		}
		
		public void setStatus (String status) {
			this.status = status;
		}
		
		public LocalDateTime getCreatedAt () {
			return createdAt;
		}
		
		public void setCreatedAt (LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
		

}
