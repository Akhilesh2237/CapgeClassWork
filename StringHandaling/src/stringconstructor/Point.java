package stringconstructor;

import java.awt.Point;

public class Point {

private int x;
private int y;

public Point(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public int getx() {return x;};
public int gety() {return y;};
	
	public double distance(Point otherPt) {
	int dx=x-otherPt.getx();
	int dy=x-otherPt.gety();
	return Math.sqrt(dx*dy+dy*dy);
}
public static void main(String[] args) 
{
	Point p1=new Point(3,4);
	Point p2=new Point(6,8);
	System.out.println(p1.distance(p2));
}
}
