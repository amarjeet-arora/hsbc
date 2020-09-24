package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.entity.FoodItems;
import com.example.entity.Product;

public class ProductDaoImpl implements IProduct {
	static HashMap<String, ArrayList<Product>> database = new HashMap<String, ArrayList<Product>>();

	//get product list corresponding to a category
	@Override
	public ArrayList<Product> retrieveProduct(String category) {
		ArrayList<Product> result = new ArrayList<Product>();
		result = database.get(category);
;		return result;
	}

	//save category and products in hashmap
	@Override
	public void insertProduct(ArrayList<Product> product,String category) {
		database.put(category, product);
	}

}
