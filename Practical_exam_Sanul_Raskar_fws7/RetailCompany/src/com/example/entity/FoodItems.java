package com.example.entity;

public class FoodItems extends Product {
	
	private String dateOfManufacture;
	private String dateOfExpiry;
	private boolean vegetarian;
	
	
	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity, String dateOfManufacture,
			String dateOfExpiry, boolean vegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}


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


	public boolean isVegetarian() {
		return vegetarian;
	}


	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}


	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + ", getItemCode()=" + getItemCode() + ", getItemName()=" + getItemName()
				+ ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()=" + getQuantity() + "]";
	}
	

}
