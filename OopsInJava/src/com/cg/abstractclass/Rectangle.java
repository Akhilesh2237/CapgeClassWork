package com.cg.abstractclass;

public class Rectangle extends Shape {
	double width=1.0;
    double length=1.0;

	public Rectangle() {
	super();
}
	

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
   public Rectangle(double width, double length,String color,boolean filled)
   {
	   this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
   }

	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public void getArea() {
		System.out.println("Area of rectangel is = "+(length*width));
	}

	@Override
	public void getPerimeter() {
      System.out.println("Perimiter of rectangle is = "+(2*(length+width)));		
	}

}
