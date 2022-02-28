package stringpracticeprograms;

public class MinimumNumber {
	
	static void minArray(int arr[]){
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				System.out.println(min);
			}
		}
	}

	public static void main(String[] args) {
     int a[]= {1,3,4,5,67};//declaring and intialising array
     minArray(a);//passing array to methord which is static
     
	}

}
