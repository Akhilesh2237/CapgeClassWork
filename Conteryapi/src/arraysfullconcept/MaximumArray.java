package arraysfullconcept;

public class MaximumArray {
public static void main(String [] args)
{
	int arr[]= {1,2,3,4,5};
	int max=Integer.MIN_VALUE;
	for(int e:arr)
	{
		if(e>max)
		{
			max=e;
		}
	}
	System.out.println("the maximum values is " +max);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	}
}
