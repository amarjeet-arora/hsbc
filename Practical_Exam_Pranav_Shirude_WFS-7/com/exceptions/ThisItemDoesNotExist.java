/**
 * 
 */
package com.exceptions;

/**
 * @author PRANAV SHIRUDE
 *
 */
public class ThisItemDoesNotExist extends Exception {
	
	public ThisItemDoesNotExist() {
		super();
	}
	
	public ThisItemDoesNotExist(String message) {
		super(message);
	}
}
