package com.example.entity;


enum Material {
	Cotton, Woolen
}

public class Apparel extends Product {

	private String size;
	private String material;

	public Apparel(int itemCode, String itemName, double unitPrice, int quantity, String size, String material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;

		if (material.equalsIgnoreCase(Material.Cotton.name())) {
			this.material = material;
		} else if (material.equalsIgnoreCase(Material.Woolen.name())) {
			this.material = material;
		}
		this.material = "";
	}

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
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + ", getItemCode()=" + getItemCode()
				+ ", getItemName()=" + getItemName() + ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()="
				+ getQuantity() + "]";
	}

	
	

}
