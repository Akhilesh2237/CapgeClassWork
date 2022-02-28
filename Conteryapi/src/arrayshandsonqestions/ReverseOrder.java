package arrayshandsonqestions;


public class ReverseOrder {
public static void main(String [] args)
{
	int[] a= {20,30,40,50,60,70};
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("The given valeue of "+a[i]);
	}
	System.out.println("the reversed order is");
	for(int i=a.length-1;i>0;i--)
	{
		System.out.println(a[i]);
	}
	

}
}
