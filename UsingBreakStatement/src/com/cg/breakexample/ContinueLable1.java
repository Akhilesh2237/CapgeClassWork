package com.cg.breakexample;

public class ContinueLable1 {
public static void main(String[] args) {
	outer : for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(j>i) {
				System.out.println();
				continue outer;
			}
			System.out.print(" "+(i*j));
		}
	}
	System.out.println();
}
}
