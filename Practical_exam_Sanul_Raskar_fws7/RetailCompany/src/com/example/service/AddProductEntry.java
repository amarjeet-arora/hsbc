package com.example.service;

import java.util.ArrayList;

import com.example.dao.ProductDaoImpl;
import com.example.entity.Apparel;
import com.example.entity.Electronics;
import com.example.entity.FoodItems;
import com.example.entity.Product;

public class AddProductEntry {

	ProductDaoImpl productDaoImplObj;

	public void addFoodProducts() {
		ArrayList<Product> foodItems = new ArrayList<Product>();
		foodItems.add(new FoodItems(1001, "Orange", 23, 10, "23/03/2020", "24/04/2020", true));
		foodItems.add(new FoodItems(1002, "Milk", 50, 40, "23/03/2020", "24/04/2020", true));
		foodItems.add(new FoodItems(1003, "Curd", 30, 50, "23/03/2020", "24/04/2020", true));
		foodItems.add(new FoodItems(1004, "Cake", 200, 8, "23/03/2020", "24/04/2020", true));
		foodItems.add(new FoodItems(1005, "Chicken", 250, 2, "23/03/2020", "24/04/2020", false));
	}

	public void addApparelProducts() {
		ArrayList<Product> apparelItems = new ArrayList<Product>();
		apparelItems.add(new Apparel(2001, "T-Shirt", 200, 30, "Large", "Cotton"));
		apparelItems.add(new Apparel(2002, "Shirt", 1800, 20, "Medium", "Cotton"));
		apparelItems.add(new Apparel(2003, "Pants", 2000, 50, "Large", "Cotton"));
		apparelItems.add(new Apparel(2004, "Cap", 100, 40, "Small", "Woolen"));
		apparelItems.add(new Apparel(2005, "Tie", 100, 60, "Large", "Cotton"));
		apparelItems.add(new Apparel(2006, "Sweater", 100, 60, "Large", "Woolen"));

	}

	public void addElectronicProducts() {
		ArrayList<Product> electronicsItems = new ArrayList<Product>();
		electronicsItems.add(new Electronics(3001, "Mobile", 30000, 45, 12));
		electronicsItems.add(new Electronics(3002, "Laptop", 50000, 23, 24));
		electronicsItems.add(new Electronics(3003, "TV", 30000, 20, 24));
		electronicsItems.add(new Electronics(3004, "Watch", 12000, 10, 12));
		electronicsItems.add(new Electronics(3005, "Monitor", 13000, 25, 24));

	}
	
}
