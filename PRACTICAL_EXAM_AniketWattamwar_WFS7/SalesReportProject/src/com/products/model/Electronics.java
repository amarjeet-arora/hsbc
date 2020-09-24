package com.products.model;

import java.util.Comparator;

/*
 * Electronics Class extended from Products
 * 
 */

/*
 * The comparator is implemented to sort the electronics items based on quantity
 */

public class Electronics extends Products implements Comparator<Electronics>{

	//declaring variables
	int warranty;

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	//Compare method to compare based on quantity
	@Override
	public int compare(Electronics o1, Electronics o2) {
		// TODO Auto-generated method stub
		return o1.getQty()-o2.getQty();
	}
	
	
	
	
}
