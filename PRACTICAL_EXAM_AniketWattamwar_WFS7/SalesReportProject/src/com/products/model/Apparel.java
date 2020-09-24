package com.products.model;

import java.util.Comparator;

/*
 * Apparel Class extended from Products
 * 
 */

/*
 * The comparator is implemented to sort the apparels based on quantity
 */

public class Apparel extends Products implements Comparator<Apparel>{

	//declaring variables
	String size;
	String material;

	//constructors
	public Apparel(String size, String material) {
		super();
		this.size = size;
		this.material = material;
	}
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * Getters and Setters
	 */
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public int compare(Apparel o1, Apparel o2) {
		// TODO Auto-generated method stub
		return o1.qty-o2.qty ;
	}
	
	
	
	
}
