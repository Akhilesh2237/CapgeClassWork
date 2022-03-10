package com.cg.projectmanagementsystem;

import java.util.Scanner;

public class Product implements Comparable<Product>{
private String productId;
private String productName;
private float productPrice;
Scanner sc=new Scanner(System.in);


public Product() {
	super();
}


public Product(String productId, String productName, float productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}


public String getProductId() {
	return productId;
}


public void setProductId(String productId) {
	this.productId = productId;
}


public String getProductName() {
	return productName;
}


public void setProductName(String productName) {
	this.productName = productName;
}


public float getProductPrice() {
	return productPrice;
}


public void setProductPrice(float productPrice) {
	this.productPrice = productPrice;
}




@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
}


public void addProductDetails() {
	try {
	System.out.println("Enter the product details");
	System.out.println("Enter the product Id:");
	productId=sc.nextLine();
	System.out.println("Enter the Name of the product");
	productName=sc.nextLine();
	System.out.println("Enter the product price");
	productPrice=sc.nextFloat();
	if(productPrice<=0)
	{
		System.out.println("Please enter the valid Price");
	}
    if(productPrice <= 0)
    {
    	System.out.println("Invalid Price ");
    	System.out.println("Please enter the price again...");
    	getProductPrice();
    	
    }
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void displayProductDetails() {
	System.out.println("Product Id is "+productId);
	System.out.println("Product Name is "+productName);
	System.out.println("Product price is "+productPrice);
}


@Override
public int compareTo(Product pt) {
	if(this.productName.compareTo(pt.getProductName()) == 0)
		return 0;
	else
		if(this.productName.compareTo(pt.getProductName()) > 0)
			return 1;
		else
		    return -1;
}
}
