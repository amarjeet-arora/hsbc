package com.products.dao;

import com.products.exceptions.ItemAlreadyExists;

/*
 * Products DAO interface to store the data into the DB(ArrayList)
 * 
 */

public interface ProductsDao {

	//Methods signatures
	public void addItem(String type,int itemCode, String itemName, int price,int qty) throws ItemAlreadyExists;
	public void retrieveReport();
	
	
}
