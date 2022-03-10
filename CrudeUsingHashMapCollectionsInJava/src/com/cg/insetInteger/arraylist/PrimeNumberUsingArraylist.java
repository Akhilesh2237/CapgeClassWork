package com.cg.insetInteger.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberUsingArraylist {

		
		ArrayList<Integer> Int;
		
		public PrimeList(int n){
			Int = new ArrayList<Integer>();
			
			perparePrimeList(n);
		}

		private void perparePrimeList(int n) {
 int count =0;
 for(int i=0;i<n;i++)
 {
	for((i%2)!=0 && (i%3)!=0 && (i%5)!=0 && (i%7)!=0) {
		Int.add(i);
		count++
	}
 }
 Int.remove(0);
 Int.remove(1);
		}
		 public void printPrimeList(){
		        System.out.println(list);

}
		 public boolean isPrime(int nbr){

	            if (list.contains(nbr)) {
	                return true;
	        }
	        return false;
	    }
		 
		 public static void main(String[] args) {

		        PrimeList primes = new PrimeList(100);
		        primes.printPrimeList();
		        primes.isPrime(33);

		    }

		}