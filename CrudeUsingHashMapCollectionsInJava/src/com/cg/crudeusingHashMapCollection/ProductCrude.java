package com.cg.crudeusingHashMapCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ProductCrude {

	HashMap<String,ReadAndDisplayProductDetails>  listofproduct=new HashMap<String,ReadAndDisplayProductDetails>();
	ReadAndDisplayProductDetails product;
	int noOfProducts;
	char ch='y';
	Scanner sc=new Scanner(System.in);
	Collection<ReadAndDisplayProductDetails> prodObjects=null;
	public void menu(){
		try {
		while(ch=='y') {
			
		System.out.println("Ente the choice");
		System.out.println("add: to add the product details");
		System.out.println("update : to update the product details");
		System.out.println("delete : to delete the product detauls");
		System.out.println("diplay : to display the product details");
		System.out.println("search : to search the product details");
		System.out.println("sortbyname: sort the product by Name ");
		System.out.println("sortbypriceasc: sort the product by Price in low to high");
		System.out.println("sortbypricedesc: sort the product by Price in High to low");
		sc.nextLine();
		String choice =sc.nextLine();
		switch (choice) {
		case "add":
			addProoduct();
			break;
		case "update":
			updateProduct();
			break;
		case "delete":
			// deleteStudent();
			deleteProductUsingName();
			break;
		case "display":
			 displayProduct();
			break;
		case "search":
			searchProductByName();
			break;
		case "sortbyname":
			sortProductByName();
			break;
		case "sortbypriceasc":
			sortProductByPriceAsc();
			break;
		case "sortbypricedesc":
			sortProductByPriceDesc();
			break;
		default:
			System.out.println("Not a proper choice");
			break;
		}
		System.out.println("If you want to continue please enter 'y'");
		ch=sc.next().charAt(0);
		if(validate(ch))
		{
			System.out.println("correct choice");
		}else
		{
			System.out.println("No a corect word please enter the 'y' to continue ");
		}
		
	}//ending while
		}//try close
		catch (Exception e) {
			e.fillInStackTrace();
		}
	}
	
 private void deleteProductUsingName() throws ProductNotFoundException{
	 ReadAndDisplayProductDetails product=searchProductByName();
	 
	 String productKey =findProductKey(product);
	 
	 if(product==null) {
		 throw new ProductNotFoundException("Product Not found .....");
	 }else {
		 listofproduct.remove(productKey,product);
	 }
	}
 
 Entry<String,ReadAndDisplayProductDetails> productEntery=null;
 private String findProductKey(ReadAndDisplayProductDetails product) {
	 String foundKey = null;
	 
	 Set<Entry<String, ReadAndDisplayProductDetails>> productEnterySets = listofproduct.entrySet();
	 Iterator<Entry<String,ReadAndDisplayProductDetails>> productItr =productEnterySets.iterator();
	 
	 while (productItr.hasNext()) {
		 productEntery=productItr.next();
		 if(productEntery.getValue().equals(product)) {
			 foundKey =  productEntery.getKey();
		 }
	 }
	 System.out.println(productEnterySets);
		return foundKey;
 }

ReadAndDisplayProductDetails foundProduct=null;
private ReadAndDisplayProductDetails searchProductByName() {
    System.out.println("Enter the name of the product to serach ..");
    String searchPName=sc.nextLine();
    prodObjects =listofproduct.values();
    Iterator<ReadAndDisplayProductDetails> productItr=prodObjects.iterator();
    while(productItr.hasNext()) {
    	foundProduct = productItr.next();
	if(foundProduct.getProductName().equals(searchPName)) {
		System.out.println("Product Found...");
		break;
	}
	
}
    System.out.println("Product details are ...");
    System.out.println("Product Id = " +foundProduct.getProductId());
    System.out.println("Product Name = " +foundProduct.getProductName());
    System.out.println("Product Price = " +foundProduct.getProductPrice());
    System.out.println("Product Catogory = " +foundProduct.getProductCategory());
    return foundProduct;

	}

private void updateProduct() throws ProductNotFoundException {
	ReadAndDisplayProductDetails product = searchProductByName();
	
	if(product== null) {
		throw new ProductNotFoundException("Product not found....");
	}else {
		System.out.println("Enter the details to update(If nessessary please enter the privious values ");
		product.readProductDetails();
	}
	
	}

	private boolean validate(char ch2) throws Exception {
		if(ch!='y')
		{
			throw new CharaterNotValidException("Charater shoul not other than 'y' ");
		}else{
			return true;
		}
	}

	private void sortProductByPriceDesc() {
		System.out.println("Befor Sorting List..");
		displayProduct();
		prodObjects =listofproduct.values();
		ArrayList<ReadAndDisplayProductDetails> prodList = new ArrayList<ReadAndDisplayProductDetails>();
		prodList.addAll(prodObjects);
		//Collections.sort(prodList,new PriceComparatorDesc());
		Collections.sort(prodList,new PriceComparator().reversed());
		System.out.println("Sorted List ......");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(ReadAndDisplayProductDetails product:prodObjects) {
			System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getProductPrice()+"\t"+ product.getProductCategory());
		}
		
	}

	private void sortProductByPriceAsc() {
		System.out.println("Befor Sorting List..");
		displayProduct();
		prodObjects =listofproduct.values();
		ArrayList<ReadAndDisplayProductDetails> prodList = new ArrayList<ReadAndDisplayProductDetails>();
		prodList.addAll(prodObjects);
		Collections.sort(prodList,new PriceComparator());
		System.out.println("Sorted List ......");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(ReadAndDisplayProductDetails product:prodObjects) {
			System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getProductPrice()+"\t"+ product.getProductCategory());
		}
		
	}

	private void sortProductByName() {
		System.out.println("Befor Sorting List..");
		displayProduct();
		prodObjects =listofproduct.values();
		ArrayList<ReadAndDisplayProductDetails> prodList = new ArrayList<ReadAndDisplayProductDetails>();
		prodList.addAll(prodObjects);
		Collections.sort(prodList,new NameComparator());
		System.out.println("Sorted List ......");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(ReadAndDisplayProductDetails product:prodObjects) {
			System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getProductPrice()+"\t"+ product.getProductCategory());
		}
		
	}
	
	/**
	 * display product object which are stored in the HashMap
	 */
	private void displayProduct() {
		prodObjects =listofproduct.values();
		System.out.println(prodObjects);
		System.out.println("List of all products .");
		System.out.println("Product Id"+"\t"+"Product Name "+"\t"+"Product Price"+"\t"+ "Product Catogary");
		for(ReadAndDisplayProductDetails product:prodObjects) {
			System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getProductPrice()+"\t"+ product.getProductCategory());
		}
	}
	/**
	 * creating the product object and storing in the HashMap
	 */
	private void addProoduct() {
    System.out.println("Enter the number of product to store in the HashMap");
    noOfProducts=sc.nextInt();
    System.out.println("Enter the Product details to add");
    //crating the product object for the given Hash code
    for(int i=0;i<noOfProducts;i++)
    {
    	product = new ReadAndDisplayProductDetails();
    	product.readProductDetails();
    	System.out.println(product);
    	System.out.println("Enter the barcode of the product....");
    	String barcode=sc.next();
    	listofproduct.put(barcode, product);
    	System.out.println(listofproduct);
    	
    }

	}
	
	
	
}
