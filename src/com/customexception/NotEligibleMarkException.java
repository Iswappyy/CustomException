package com.customexception;

public class NotEligibleMarkException extends Exception {
	private static String msg = "Not Eligible Mark";
	
	public NotEligibleMarkException () {
		this(msg);
	}

	public NotEligibleMarkException(String message) {
		super(message);
	}

}
