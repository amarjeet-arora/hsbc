/**
 * 
 */
package com.exceptions;

/**
 * @author PRANAV SHIRUDE
 *
 */
public class ItemAlreadyExist extends Exception{
	
	public ItemAlreadyExist() {
		super();
	}
	
	public ItemAlreadyExist(String msg) {
		super(msg);
	}
}
