package arrayshandsonqestions;

import java.util.Arrays;

public class MergeTwoUnshotedArray {
public static void mergeArrays(int a[],int b[],int res[])
{
	int i=0,j=0,k=0;
	while(i<a.length)
	{
		res[k]=a[i];
		i++;
		k++;
	}
	while(j<b.length)
	{
		res[k]=b[j];
		j++;
		k++;
	}
	Arrays.sort(res);
	
}
	public static void main(String[] args) {
   
		int[] a= {1,9,8,5,3,2};
		int[] b= {1,3,4,2,5,6};
		 int res[]=new int[a.length +b.length];
		mergeArrays(a,b,res);
		System.out.println("shorted merge list");
		for(int i=0;i<res.length;i++)
		{
			System.out.println("the merged value is"+res[i]);
		}
	}

}
