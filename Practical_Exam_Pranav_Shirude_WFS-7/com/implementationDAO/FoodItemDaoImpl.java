/**
 * 
 */
package com.implementationDAO;

import java.util.HashMap;
import java.util.Map;

import com.dao.FoodItemDao;
import com.exceptions.ItemAlreadyExist;
import com.exceptions.ThisItemDoesNotExist;
import com.model.FoodItems;

/**
 * @author PRANAV SHIRUDE
 *
 */
public class FoodItemDaoImpl implements FoodItemDao {

	Map<Integer, FoodItems> fooditems = new HashMap<Integer, FoodItems>();
	
	/*
	 *  Method Calculate total sold quantity
	 */
	@Override
	public void calcFoodItemSoldQuantity() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Method to add new Food Items
	 */
	@Override
	public FoodItems addnewFoodItems(int itemID, FoodItems fi) throws ItemAlreadyExist, ThisItemDoesNotExist {
		return fi;
		// TODO Auto-generated method stub
//		int fitems = fitems.getFoodItemCode();
//		if(fitems == null) {
//			throws
//		}
		
		

		
	}

	/*
	 * Method to display items
	 */
	@Override
	public void displayFoodItems() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
