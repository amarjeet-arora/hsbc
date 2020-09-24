package com.example.service;

import java.util.Comparator;

import com.example.entity.Product;


//Compare two objects based on quantity varibale in descending order
class QuantityComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {

		if (p1.getQuantity() > p2.getQuantity())
			return -1;
		if (p1.getQuantity() < p2.getQuantity())
			return 1;
		else
			return 0;
	}
}
