package com.example.service;

import java.util.ArrayList;
import java.util.Collections;

import com.example.dao.ProductDaoImpl;
import com.example.entity.Product;

//Business layer class to get products from database and the sort them and return to view layer
public class ShowTopProducts {

	ProductDaoImpl productDaoImplObj;
	
	public ArrayList<Product> showTopProducts(String category){
		ArrayList<Product> list =  productDaoImplObj.retrieveProduct(category);
		
		Collections.sort(list,new QuantityComparator());
		
		//TODO: return only top 3 items
		return list;
	}
}
