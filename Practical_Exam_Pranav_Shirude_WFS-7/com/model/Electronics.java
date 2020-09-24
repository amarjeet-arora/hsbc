package com.model;

import java.util.ArrayList;

/*
 * Author : @Pranav Shirude
 * Purpose : Build java based system to give daily sales report
 */

/*
 * Class Electronics : Entity class
 */
public class Electronics {
	
	//variable declaration
	private int electronicsItemCode;
	private String electronicsItemName;
	private String electronicsItemUnitPrice;
	private int electronicsItemQuantity;
	private int electronicsItemWarranty;
	
	ArrayList<Electronics> electronics;
	
	//Constructors
	public Electronics(int electronicsItemCode, String electronicsItemName, String electronicsItemUnitPrice,
			int electronicsItemQuantity, int electronicsItemWarranty) {
		super();
		this.electronicsItemCode = electronicsItemCode;
		this.electronicsItemName = electronicsItemName;
		this.electronicsItemUnitPrice = electronicsItemUnitPrice;
		this.electronicsItemQuantity = electronicsItemQuantity;
		this.electronicsItemWarranty = electronicsItemWarranty;
	}
	

	//Getter and Setter Methods
	public int getElectronicsItemCode() {
		return electronicsItemCode;
	}
	
	public void setElectronicsItemCode(int electronicsItemCode) {
		this.electronicsItemCode = electronicsItemCode;
	}
	public String getElectronicsItemName() {
		return electronicsItemName;
	}
	public void setElectronicsItemName(String electronicsItemName) {
		this.electronicsItemName = electronicsItemName;
	}
	public String getElectronicsItemUnitPrice() {
		return electronicsItemUnitPrice;
	}
	public void setElectronicsItemUnitPrice(String electronicsItemUnitPrice) {
		this.electronicsItemUnitPrice = electronicsItemUnitPrice;
	}
	public int getElectronicsItemQuantity() {
		return electronicsItemQuantity;
	}
	public void setElectronicsItemQuantity(int electronicsItemQuantity) {
		this.electronicsItemQuantity = electronicsItemQuantity;
	}
	public int getElectronicsItemWarranty() {
		return electronicsItemWarranty;
	}
	public void setElectronicsItemWarranty(int electronicsItemWarranty) {
		this.electronicsItemWarranty = electronicsItemWarranty;
	}
	
	//toString Method

	@Override
	public String toString() {
		return "Electronics [electronicsItemCode=" + electronicsItemCode + ", electronicsItemName="
				+ electronicsItemName + ", electronicsItemUnitPrice=" + electronicsItemUnitPrice
				+ ", electronicsItemQuantity=" + electronicsItemQuantity + ", electronicsItemWarranty="
				+ electronicsItemWarranty + "]";
	}
	
	
}
