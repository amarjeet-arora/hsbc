/**
 * 
 */
package com.dao;

import com.exceptions.ItemAlreadyExist;
import com.exceptions.ThisItemDoesNotExist;
import com.model.FoodItems;

/**
 * @author PRANAV SHIRUDE
 * Purpose : Build java based system to give daily sales report
 *
 */


public interface FoodItemDao {
	
	public void calcFoodItemSoldQuantity();
	public void displayFoodItems();
	FoodItems addnewFoodItems(int itemID, FoodItems fi) throws ItemAlreadyExist, ThisItemDoesNotExist;
	
}
