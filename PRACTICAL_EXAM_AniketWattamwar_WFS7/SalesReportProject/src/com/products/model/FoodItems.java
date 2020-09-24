package com.products.model;

import java.util.Comparator;

/*
 * FoodItems Class extended from Products
 * 
 */

/*
 * The comparator is implemented to sort the food items based on quantity
 */

public class FoodItems extends Products implements Comparator<FoodItems> {

	//declaring variables
	String dateOfManufacture;
	String dateOfExpiry;
	
	
	/*
	 * Getters and Setters
	 */
	
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	//Compare method to compare based on quantity
	@Override
	public int compare(FoodItems o1, FoodItems o2) {
		// TODO Auto-generated method stub
		return o1.getQty() - o2.getQty();
	}
	
	
}
