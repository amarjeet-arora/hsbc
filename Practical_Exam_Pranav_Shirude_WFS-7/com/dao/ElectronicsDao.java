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
public interface ElectronicsDao {
	
	public void calcElectronicsSoldQuantity();
	public void addnewElectonicsItems() throws ItemAlreadyExist, ThisItemDoesNotExist;
	public void displayElectronicsItems();
	
}
