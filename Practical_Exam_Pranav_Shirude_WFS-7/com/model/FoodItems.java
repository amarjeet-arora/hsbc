package com.model;
/*
 * Author : @Pranav Shirude
 * Purpose : Build java based system to give daily sales report
 */

import java.util.ArrayList;
import java.util.Date;

/*
 * Class FoodItems : Entity class
 */
public class FoodItems {
	
	//Variable Declaration
	private int foodItemCode;
	private String foodItemName;
	private int foodItemUnitPrice;
	private Date foodItemDateOfManufacture;
	private Date foodItemDateOfExpiry;
	private int foodItemQuantity;
	private boolean isFoodItemVeg; 
	
	ArrayList<FoodItems> fooditems;
	
	//Constructors
	
	public FoodItems(int foodItemCode, String foodItemName, int foodItemUnitPrice, Date foodItemDateOfManufacture,
			Date foodItemDateOfExpiry, int foodItemQuantity, boolean isFoodItemVeg) {
		super();
		this.foodItemCode = foodItemCode;
		this.foodItemName = foodItemName;
		this.foodItemUnitPrice = foodItemUnitPrice;
		this.foodItemDateOfManufacture = foodItemDateOfManufacture;
		this.foodItemDateOfExpiry = foodItemDateOfExpiry;
		this.foodItemQuantity = foodItemQuantity;
		this.isFoodItemVeg = isFoodItemVeg;
	}

	
	
	//Getter Setter Methods
	public int getFoodItemCode() {
		return foodItemCode;
	}
	
	
	public void setFoodItemCode(int foodItemCode) {
		this.foodItemCode = foodItemCode;
	}
	public boolean isFoodItemVeg() {
		return isFoodItemVeg;
	}

	public void setFoodItemVeg(boolean isFoodItemVeg) {
		this.isFoodItemVeg = isFoodItemVeg;
	}

	public String getFoodItemName() {
		return foodItemName;
	}
	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	public int getFoodItemUnitPrice() {
		return foodItemUnitPrice;
	}
	public void setFoodItemUnitPrice(int foodItemUnitPrice) {
		this.foodItemUnitPrice = foodItemUnitPrice;
	}
	public Date getFoodItemDateOfManufacture() {
		return foodItemDateOfManufacture;
	}
	public void setFoodItemDateOfManufacture(Date foodItemDateOfManufacture) {
		this.foodItemDateOfManufacture = foodItemDateOfManufacture;
	}
	public Date getFoodItemDateOfExpiry() {
		return foodItemDateOfExpiry;
	}
	public void setFoodItemDateOfExpiry(Date foodItemDateOfExpiry) {
		this.foodItemDateOfExpiry = foodItemDateOfExpiry;
	}
	public int getFoodItemQuantity() {
		return foodItemQuantity;
	}
	public void setFoodItemQuantity(int foodItemQuantity) {
		this.foodItemQuantity = foodItemQuantity;
	}



	@Override
	public String toString() {
		return "FoodItems [foodItemCode=" + foodItemCode + ", foodItemName=" + foodItemName + ", foodItemUnitPrice="
				+ foodItemUnitPrice + ", foodItemDateOfManufacture=" + foodItemDateOfManufacture
				+ ", foodItemDateOfExpiry=" + foodItemDateOfExpiry + ", foodItemQuantity=" + foodItemQuantity
				+ ", isFoodItemVeg=" + isFoodItemVeg + "]";
	}

	//toString() Method
	
	
	
	
}
