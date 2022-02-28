package foreachloop;

public class ForEach {
public static void main(String[]args)
{
	int nums[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	//using for each style to display the values
	for(int x:nums)
	{
		System.out.println("Value is :"+x);
		sum+=x;
	}
	System.out.println("the sum of all valeues = "+sum);
}
}
