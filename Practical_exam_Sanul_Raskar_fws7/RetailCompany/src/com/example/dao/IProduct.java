package com.example.dao;

import java.util.ArrayList;

import com.example.entity.Product;

public interface IProduct {

	void insertProduct(ArrayList<Product> product,String category);
	ArrayList<Product> retrieveProduct(String category);
}
