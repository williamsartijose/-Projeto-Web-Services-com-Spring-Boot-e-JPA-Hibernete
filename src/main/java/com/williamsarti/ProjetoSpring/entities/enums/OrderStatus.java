package com.williamsarti.ProjetoSpring.entities.enums;

import org.hibernate.boot.model.naming.IllegalIdentifierException;

public enum OrderStatus {
	
	WAITING_PATMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
				
			}
		}
		throw new IllegalIdentifierException("Invalid OrderStatus Code");
	}

}
