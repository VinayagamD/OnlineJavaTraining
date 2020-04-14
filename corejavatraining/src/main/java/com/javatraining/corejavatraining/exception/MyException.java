/**
 * 
 */
package com.javatraining.corejavatraining.exception;

/**
 * @author vinay
 *
 */
public class MyException extends Exception {
	
	private int exceptionCode;
	private String message;
	public MyException(int exceptionCode, String message) {
		super(message);
		this.exceptionCode = exceptionCode;
	}
	public int getExceptionCode() {
		return exceptionCode;
	}
	
	

}
