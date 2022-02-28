package loopsinjava;

import java.util.Arrays;

public class ArrayInitialisationDemo {

	public static void main(String[] args) {
    char [] words = {'A','B','C','D','E'};
    System.out.println("values of Array");
    for(int i=0;i<words.length;i++)
    {
    	System.out.println(words[i]);
    }
    Arrays.sort(words);
    System.out.println("the values of Array after sort");
    for(int i=0;i<words.length;i++)
    {
    	System.out.println(words[i]);
    }
    System.out.println("the values of Array after sort and reverced");
    for(int i=words.length-1;i>=0;i--)
    {
    	System.out.println(words[i]);
    }
	}

}
