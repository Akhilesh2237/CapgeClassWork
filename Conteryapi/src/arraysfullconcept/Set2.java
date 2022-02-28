package arraysfullconcept;

public class Set2 {

	public static void main(String[] args) {
		float a[]= {1.2f,2.3f,3.4f,4.5f,5.6f};
		float num=3.45f;
		boolean isInArray=false;
for(float i:a)
	{
	if(num==i)
	{
		isInArray=true;
		break;
	}
	}
if(isInArray)
	{
	System.out.println("the value is present in array");
	}else{
		System.out.println("the value is not present");
	}}

}
