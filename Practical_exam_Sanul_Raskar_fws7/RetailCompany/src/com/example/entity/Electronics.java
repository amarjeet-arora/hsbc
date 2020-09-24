package com.example.entity;

public class Electronics extends Product {

	private int warranty;

	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, int warranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + ", getItemCode()=" + getItemCode() + ", getItemName()="
				+ getItemName() + ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()=" + getQuantity() + "]";
	}

	
}
