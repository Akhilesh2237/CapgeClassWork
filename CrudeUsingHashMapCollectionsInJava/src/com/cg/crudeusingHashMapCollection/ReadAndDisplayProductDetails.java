package com.cg.crudeusingHashMapCollection;

import java.util.Scanner;

public class ReadAndDisplayProductDetails extends Product {
	Scanner sc=new Scanner(System.in);
    
	 void readProductDetails() {
		try {
			
		System.out.println("Enter the Product Details");
		System.out.println("Enter the Product Id...");
		setProductId(sc.nextInt());
		System.out.println("Enter the Product Name...");
		setProductName(sc.nextLine());
		sc.nextLine();// throw away the newline read by scanner
		System.out.println("Enter the Product Price...");
		setProductPrice(sc.nextFloat());
		if (validate(getProductPrice())) {
			System.out.println("Thank you for providing correct price.....");
		} else {
			System.out.println("Enter valid price");
		}
		System.out.println("Enter the Product Catogory...");
		sc.nextLine();// throw away the newline read by scanner
		setProductCategory(sc.nextLine());
	}catch (Exception e) {
		e.fillInStackTrace();
	}
		}
	
	private boolean validate(float productPrice) throws PriceNotValidException{
		if(productPrice<=0) {
			throw new PriceNotValidException("Price cannot be less than or equlas to zero");
		}else {
		return true;
	}}

}
