package com.example.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.entity.FoodItems;
import com.example.entity.Product;
import com.example.service.AddProductEntry;
import com.example.service.ShowTopProducts;

public class Client {

	public static void main(String[] args) {

		int option;
		Scanner scannerObj = new Scanner(System.in);
		String category;

		try {
			// Add Products to database
			AddProductEntry addProductObj = new AddProductEntry();
			addProductObj.addFoodProducts();
			addProductObj.addApparelProducts();
			addProductObj.addElectronicProducts();

			// get input from user for which category he wants to see top products
			System.out.println("Select a category\n1.Food Items\n2.Apparel\n3.Electronics\n");
			option = scannerObj.nextInt();

			if (option == 1)
				category = "food";
			else if (option == 2)
				category = "apparel";
			else
				category = "electronics";

			ShowTopProducts topProduct = new ShowTopProducts();
			// Get top products from business layer
			ArrayList<Product> result = topProduct.showTopProducts(category);

			// Display top products for selected category
			for (Product p : result) {
				System.out.println(p);
			}

		} catch (InputMismatchException e) {
			System.out.println("Please provide option 1, 2 or 3");
		}

	}

}
