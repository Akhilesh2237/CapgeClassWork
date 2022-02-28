package arraysfullconcept;

public class SplittingArray {

	public static void main(String[] args) {
  int arr[]= {58,24,13,15,63,9,8,81,1,78};
  int n=arr.length;
  for(int i=0;i<n;i++)
  {
	  System.out.println("the given array is "+arr[i]);
  }
 int arr1[]=new int[n/2];
 for(int i=0;i<n/2;i++)
 {
	 arr1[i]=arr[i];
 }
 for(int z:arr1)
 {
	 System.out.println(z);
 }
 int arr2[]=new int[n-arr1.length];

 for(int i=0;i<n-arr1.length;i++)
 {
	 arr2[i]=arr[i+arr1.length];
 }
 for(int x:arr2)
 {
	 System.out.println(x);
 }
	}

}
