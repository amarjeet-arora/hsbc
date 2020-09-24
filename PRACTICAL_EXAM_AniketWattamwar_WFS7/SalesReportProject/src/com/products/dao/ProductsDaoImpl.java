package com.products.dao;

import java.util.ArrayList;
import java.util.Collections;

import com.products.exceptions.ItemAlreadyExists;
import com.products.model.Apparel;
import com.products.model.Electronics;
import com.products.model.FoodItems;

/*
 * 
 * Implementation of Products DAO Interface
 * Data is stored in the respective arraylist
 * 
 * 
 */

public class ProductsDaoImpl implements ProductsDao{
	
	//Individual Arraylist to store the items 
	ArrayList<Apparel> apparel = new ArrayList<Apparel>();
	ArrayList<Electronics> electronics = new ArrayList<Electronics>();
	ArrayList<FoodItems> foodItems = new ArrayList<FoodItems>();
 
	//method to retrieve the report
	@Override
	public void retrieveReport() {
		
		
		for(Electronics e:electronics) {
			System.out.println(e);
		}
		//Sorting the list based on quantity to generate a report with the top 3 items sold
		Collections.sort(apparel);
		Collections.sort(electronics);
		Collections.sort(foodItems);
		
		
		
	}
	
	
	//method to add the item in their respective arraylist based on type
	@Override
	public void addItem(String type, int itemCode, String itemName, int price, int qty) throws ItemAlreadyExists {
		
		if(type == "electronics") {
			Electronics item = new Electronics();
			electronics.add(item);
			
		}
		if(type == "apparel") {
			Apparel item = new Apparel();
			apparel.add(item);
		}
		if(type == "fooditems") {
			FoodItems item = new FoodItems();
			foodItems.add(item);
		}
		
		
		
	}
	
	

}
