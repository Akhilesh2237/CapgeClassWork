package com.cg.discountsystem;

public class DiscountRate {
private double serviceDiscountPremium;
private double serviceDiscountGold;
private double serviceDiscountSilver;
private double productDiscountPremium;
private double productDiscountGold;
private double productDiscountSilver;




public DiscountRate() {
	super();
}



public DiscountRate(double serviceDiscountPremium, double serviceDiscountGold, double serviceDiscountSilver,
		double productDiscountPremium, double productDiscountGold, double productDiscountSilver) {
	super();
	this.serviceDiscountPremium = serviceDiscountPremium;
	this.serviceDiscountGold = serviceDiscountGold;
	this.serviceDiscountSilver = serviceDiscountSilver;
	this.productDiscountPremium = productDiscountPremium;
	this.productDiscountGold = productDiscountGold;
	this.productDiscountSilver = productDiscountSilver;
}



public double getServiceDiscountPremium() {
	return serviceDiscountPremium;
}



public void setServiceDiscountPremium(double serviceDiscountPremium) {
	this.serviceDiscountPremium = serviceDiscountPremium;
}



public double getServiceDiscountGold() {
	return serviceDiscountGold;
}



public void setServiceDiscountGold(double serviceDiscountGold) {
	this.serviceDiscountGold = serviceDiscountGold;
}



public double getServiceDiscountSilver() {
	return serviceDiscountSilver;
}



public void setServiceDiscountSilver(double serviceDiscountSilver) {
	this.serviceDiscountSilver = serviceDiscountSilver;
}



public double getProductDiscountPremium() {
	return productDiscountPremium;
}



public void setProductDiscountPremium(double productDiscountPremium) {
	this.productDiscountPremium = productDiscountPremium;
}



public double getProductDiscountGold() {
	return productDiscountGold;
}



public void setProductDiscountGold(double productDiscountGold) {
	this.productDiscountGold = productDiscountGold;
}



public double getProductDiscountSilver() {
	return productDiscountSilver;
}



public void setProductDiscountSilver(double productDiscountSilver) {
	this.productDiscountSilver = productDiscountSilver;
}



public void getserviceDiscountRate() {
	serviceDiscountPremium=0.2;
	serviceDiscountGold=0.15;
	serviceDiscountSilver=0.1;
}

public void getproductDiscountRate() {
	productDiscountPremium =0.1;
	productDiscountGold=0.1;
	productDiscountSilver=0.1;
}
}
