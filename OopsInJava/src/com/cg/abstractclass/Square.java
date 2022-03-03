package com.cg.abstractclass;

public class Square extends Rectangle {
public Square() {
	super();
}

public Square(double side) {
	this.length=side;
}
public Square(double side,String color,boolean filled) {
	this.length=side;
	this.color = color;
	this.filled = filled;
}
public double getSide() {
	return length;
	
}
public void setSide(double side) {
	this.length=side;
}

public void setWidth(double side) {
	this.length=side;
}
public void setLength(double side) {
	this.length=side;
}

public void getArea() {
	System.out.println("the area of square = "+(length*length));
}
public void getPerimiter() {
	System.out.println("The Perimiter of Square is "+(4*length));
}
}
