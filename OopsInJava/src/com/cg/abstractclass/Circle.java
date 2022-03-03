package com.cg.abstractclass;

public class Circle extends Shape{
double radius=1.0;

public Circle() {
	super();
}

public Circle(double radius) {
	super();
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

@Override
public void getArea() {
	
}

@Override
public void getPerimeter() {
	// TODO Auto-generated method stub
	
}


}
