package com.sreenutech.orders.util;

public class OrderServiceException extends Exception {
	
	private String statusCode;
	private String statusMSg;
	
	public OrderServiceException(String statusCode,String statusMSg){
		this.statusCode = statusCode;
		this.statusMSg = statusMSg;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getStatusMSg() {
		return statusMSg;
	}

	
}
