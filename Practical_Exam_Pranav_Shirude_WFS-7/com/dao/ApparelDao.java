/**
 * 
 */
package com.dao;

import com.exceptions.ItemAlreadyExist;
import com.exceptions.ThisItemDoesNotExist;

/**
 * @author PRANAV SHIRUDE
 * Purpose : Build java based system to give daily sales report
 *
 */
public interface ApparelDao {
	
	public void calcApparelsSoldQuantity();
	public void addnewApparels() throws ItemAlreadyExist, ThisItemDoesNotExist;
	public void displayApparels();
}
