package com.geopagos.exceptions;

/***
 * 
 * @author user A A Berlot
 * 29/03/2018
 *
 */

public class ExceptionRegisterMessures extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String message = "Something appear to be wrong please check you connection data before continue";
	
	public ExceptionRegisterMessures() {
		
		System.out.println(message);
	}
	
	public String responseException() {
		
		return message;
	}
	
}
