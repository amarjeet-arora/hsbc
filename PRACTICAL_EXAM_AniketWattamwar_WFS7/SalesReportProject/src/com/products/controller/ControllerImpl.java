package com.products.controller;

import java.util.Scanner;

import com.products.dao.ProductsDao;
import com.products.dao.ProductsDaoImpl;
import com.products.exceptions.ItemAlreadyExists;

/*
 * Controller Interface Implementation 
 * 
 * Inputs taken from the user before calling the DAO functions
 * 
 */

public class ControllerImpl implements Controller {

	Scanner sc = new Scanner(System.in);
	
		ProductsDao productsDao = new ProductsDaoImpl();
	
	@Override
	public void addItem(String type) {
		//If the type selected by the user is electronics 
		if(type == "electronics") {
			System.out.println("Enter item code");
			int code = sc.nextInt();
			
			System.out.println("Enter item Name");
			String name = sc.next();
			
			System.out.println("Enter item price");
			int price = sc.nextInt();
			
			System.out.println("Enter item qty");
			int qty = sc.nextInt();
			
			/*
			 * Inputs taken from the user, then call the DAO add item function
			 * 
			 * IF the item already exists then throw an exception-ItemAlreadyExist
			 */
			
			try {
				productsDao.addItem(type, code, name, price, qty);
			} catch (ItemAlreadyExists e) {
				System.out.println("Item already exists");
				e.printStackTrace();
			}
		}
		//If the type selected by the user is foodItems 
		if(type =="fooditems") {
			System.out.println("Enter item code");
			int code = sc.nextInt();
			
			System.out.println("Enter item Name");
			String name = sc.next();
			
			System.out.println("Enter item price");
			int price = sc.nextInt();
			
			System.out.println("Enter item qty");
			int qty = sc.nextInt();
			
			/*
			 * Inputs taken from the user, then call the DAO add item function
			 * 
			 * IF the item already exists then throw an exception-ItemAlreadyExist
			 */
			
			try {
				productsDao.addItem(type, code, name, price, qty);
			} catch (ItemAlreadyExists e) {
				System.out.println("Item already exists");
				e.printStackTrace();
			}
			
		}
		
		//If the type selected by the user is apparels 
		if(type == "apparels") {
			System.out.println("Enter item code");
			int code = sc.nextInt();
			
			System.out.println("Enter item Name");
			String name = sc.next();
			
			System.out.println("Enter item price");
			int price = sc.nextInt();
			
			System.out.println("Enter item qty");
			int qty = sc.nextInt();
			
			/*
			 * Inputs taken from the user, then call the DAO add item function
			 * 
			 * IF the item already exists then throw an exception-ItemAlreadyExist
			 */
			
			try {
				productsDao.addItem(type, code, name, price, qty);
			} catch (ItemAlreadyExists e) {
				System.out.println("Item already exists");
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void retrieveReport() {
		
		productsDao.retrieveReport();
	}

}
