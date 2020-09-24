package com.products.model;

public class Products {
	
	String type;
	
	int itemCode;
	String itemName;
	int price;
	int qty;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Products [type=" + type + ", itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price
				+ ", qty=" + qty + "]";
	}
	
	
	

}
