package com.cg.crudeusingHashMapCollection;

import java.util.Objects;

public class Product {
private int productId;
private String productName;
private float productPrice;
private String productCategory;
public Product() {
	super();
}
public Product(int productId, String productName, float productPrice, String productCategory) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
	this.productCategory = productCategory;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
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
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
			+ ", productCategory=" + productCategory + "]";
}
@Override
public int hashCode() {
	return Objects.hash(productCategory, productId, productName, productPrice);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return Objects.equals(productCategory, other.productCategory) && productId == other.productId
			&& Objects.equals(productName, other.productName)
			&& Float.floatToIntBits(productPrice) == Float.floatToIntBits(other.productPrice);
}


}
