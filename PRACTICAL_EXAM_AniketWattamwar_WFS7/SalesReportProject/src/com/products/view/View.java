package com.products.view;

import java.util.Scanner;

import com.products.controller.Controller;
import com.products.controller.ControllerImpl;
import com.products.dao.ProductsDao;
import com.products.dao.ProductsDaoImpl;
import com.products.exceptions.ItemAlreadyExists;


/*
 * 
 * @author Aniket Wattamwar
 * 
 * A java application that take input as category ( Food , Electronics, Apparel) from the user and it returns 
 * 
 * 
 * 
 * 
 */



//Main method
public class View {
	
	public static void main(String[] args) {
		
		int choice=0;
		Scanner sc = new Scanner(System.in);
		Controller controller = new ControllerImpl();
		ProductsDao dao = new ProductsDaoImpl();
		while(choice!=5)
		{
			System.out.println("\n");
			System.out.println("Please choose one of the option from below");
			System.out.println("1.) Add an Electronics Item\n "+
								"2.) Add Apparel Item\n"+
								"3.) Add a food item\n" +
								"4.) generate report\n" +
								"5.) Exit"
					);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				
				String type = "electronics";
				controller.addItem(type);
				
				//dao.addItem(type, 1013, "TV", 20000, 2);
				break;
			case 2:
				String type2 = "apparel";
				controller.addItem(type2);
				break;
			case 3:
				String type3 = "apparel";
				controller.addItem(type3);
				//dao.addItem(type3, 101, "milk", 25, 20);
				break;
			case 4:
				controller.retrieveReport();
				break;
			case 5:
				break;
			}

		}
		
		
		
	}
	

}
