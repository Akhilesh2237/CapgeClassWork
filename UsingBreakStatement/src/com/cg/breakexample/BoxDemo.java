package com.cg.breakexample;

public class BoxDemo {

	public static void main(String[] args) {

		double vol;
		Box mybox=new Box();
		mybox.width=10;
		mybox.hight=20;
		mybox.depth=15;
		vol=mybox.width*mybox.hight*mybox.depth;
		System.out.println("Volume is "+ vol);
	}

}
