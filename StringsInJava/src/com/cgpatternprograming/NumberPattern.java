package com.cgpatternprograming;

public class NumberPattern {

	public static void main(String[] args) {
for (int i=0;i<=5;i++) {
	int no=i;
	for(int j=1;j<=i;j++)
	{
		System.out.print(no);
		no=no+5-j;
	}
	System.out.println("");
}
	}

}
