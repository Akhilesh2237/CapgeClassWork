package com.cg.projectmanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductCrudeUsingArrayList {
//array list of Product Objects
	ArrayList<Product> listOfProducts = new ArrayList<Product>();
	Product product;
	int noOfProducts;
	Scanner sc=new Scanner(System.in);
	char ch = 'y';
	
	public void menu() {
		try {
		while (ch=='y') {
			System.out.println("Enter the choice....");
			System.out.println("add: to add the product in array");
			System.out.println("updat: to update the product is array");
			System.out.println("delete: to delete the product is array");
			System.out.println("display: to display the product is array");
			System.out.println("search: to search the product is array");
			System.out.println("sort: to sort the product is array by price");
			System.out.println("searchByName: to search the product in array by name");
            sc.nextLine();
			String choice=sc.nextLine();
			switch (choice) {
			case "add":
				addProduct();
				break;
			case "update":
				updateProduct();
				break;
			case "delete":
				//deleteProduct();
				deleteProductUsingSearch();
				break;
			case "display":
				displayProduct();
				break;
			case "search":
				searchProduct();
				break;
			case "sort":
				sortProduct();
				break;
			case "searchByName":
				addSearchByProductName();
				break;

			default:
				System.out.println("Not a proper choice");
				break;
			}
			System.out.println("do you want to continue....");
			System.out.println("Enter 'y' to continue ......");
			ch = sc.next().charAt(0);

		}//while close
		}//try close
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void sortProduct() {
		Collections.sort(listOfProducts);
		displayProduct();
	}
	
	private Product searchProduct() {
		System.out.println("Enter the product details to search...");
		System.out.println("Enter the product id to search...");
		String pId = sc.nextLine();
		for (int i = 0; i < listOfProducts.size(); i++) {
			if(listOfProducts.get(i).getProductId().equals(pId)) {
				product = listOfProducts.get(i);
				System.out.println("Product Id" + "\t" + "Product Name" + "\t" + "Product Price");
				System.out.println(listOfProducts.get(i).getProductId() + "\t\t" +listOfProducts.get(i).getProductName() + "\t\t" +listOfProducts.get(i).getProductPrice() );
			}
		}
		
		return product;
		
	}
	private void displayProduct() {
		System.out.println("Product details to display.....");
		// display the student data
		System.out.println("Product Id" + "\t" + "Product Name" + "\t" + "Product Price");
		for (int i = 0; i < listOfProducts.size(); i++) {	
			System.out.println(listOfProducts.get(i).getProductId() + "\t\t" +listOfProducts.get(i).getProductName() + "\t\t" +listOfProducts.get(i).getProductPrice());
		}
	}
	private void deleteProduct() {
		System.out.println("Enter the product details to delete");
		System.out.println("Enter the product id to delete");
		String pId = sc.nextLine();
	
		for (int i = 0; i < listOfProducts.size(); i++) {
			if(listOfProducts.get(i).getProductId() == pId) {
				Product p = listOfProducts.get(i);
				System.out.println(p);
				if(listOfProducts.remove(p)) {
					System.out.println("product removed successfully");
				}else {
					System.out.println("product Not removed");
				}
				
			}
		}
	}
	private void deleteProductUsingSearch() {
		product = searchProduct();
		 if(listOfProducts.remove(product)) {
			System.out.println("product removed successfully");
		}else {
			System.out.println("product Not removed");
		}
	}
	
	private void updateProduct() {
		Product product1 = searchProduct();
		if(product1 != null) {
			System.out.println("Enter the details to Modify .......");
			product1.addProductDetails();
			
	}
		}
	private void addProduct() {
		System.out.println("Enter the number of products");
		noOfProducts = sc.nextInt();
		System.out.println("Enter the product details");
		
		for (int i = 0; i < noOfProducts; i++) {
			product = new Product();
			product.addProductDetails();
			System.out.println(product);
			listOfProducts.add(product);
			System.out.println(listOfProducts);
		}
	}
	private void addSearchByProductName() {
		System.out.println("Enter the product details to search...");
		System.out.println("Enter the product Name to search...");
		String pName = sc.nextLine();
		for (int i = 0; i < listOfProducts.size(); i++) {
		if(listOfProducts.get(i).getProductName().equals(pName)) {
			product = listOfProducts.get(i);
			System.out.println("Product Id" + "\t" + "Product Name" + "\t" + "Product Price");
			System.out.println(listOfProducts.get(i).getProductId() + "\t\t" +listOfProducts.get(i).getProductName() + "\t\t" +listOfProducts.get(i).getProductPrice() );
		}
	}}
}