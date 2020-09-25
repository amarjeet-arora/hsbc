package com.model;

import java.util.ArrayList;

/*
 * Author : @Pranav Shirude
 * Purpose : Build java based system to give daily sales report
 */

/*
 * Class Apparel : Entity class
 */
public class Apparel {
	
	//variable declaration
	private int apparelItemCode;
	private String apparelItemName;
	private int apparelUnitPrice;
	private int apparelSize;
	private int apparelQuantity;
	private String isMaterial;
	
	ArrayList<Apparel> apparels;
	

	//constructors
	

	//getter and setter methods
	public int getApparelItemCode() {
		return apparelItemCode;
	}


	

	public Apparel(int apparelItemCode, String apparelItemName, int apparelUnitPrice, int apparelSize,
			int apparelQuantity, String isMaterial) {
		super();
		this.apparelItemCode = apparelItemCode;
		this.apparelItemName = apparelItemName;
		this.apparelUnitPrice = apparelUnitPrice;
		this.apparelSize = apparelSize;
		this.apparelQuantity = apparelQuantity;
		this.isMaterial = isMaterial;
	}




	public void setApparelItemCode(int apparelItemCode) {
		this.apparelItemCode = apparelItemCode;
	}


	public String getApparelItemName() {
		return apparelItemName;
	}


	public void setApparelItemName(String apparelItemName) {
		this.apparelItemName = apparelItemName;
	}


	public int getApparelUnitPrice() {
		return apparelUnitPrice;
	}


	public void setApparelUnitPrice(int apparelUnitPrice) {
		this.apparelUnitPrice = apparelUnitPrice;
	}


	public int getApparelSize() {
		return apparelSize;
	}


	public void setApparelSize(int apparelSize) {
		this.apparelSize = apparelSize;
	}


	public int getApparelQuantity() {
		return apparelQuantity;
	}


	public void setApparelQuantity(int apparelQuantity) {
		this.apparelQuantity = apparelQuantity;
	}

	
	public String getIsMaterial() {
		return isMaterial;
	}


	public void setIsMaterial(String isMaterial) {
		this.isMaterial = isMaterial;
	}



	//toString() method

	@Override
	public String toString() {
		return "Apparel [apparelItemCode=" + apparelItemCode + ", apparelItemName=" + apparelItemName
				+ ", apparelUnitPrice=" + apparelUnitPrice + ", apparelSize=" + apparelSize + ", apparelQuantity="
				+ apparelQuantity + ", isMaterial=" + isMaterial + "]";
	}


	
	
	
	
}
