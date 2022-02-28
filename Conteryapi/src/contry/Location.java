package contry;
import java.util.Scanner;
import acm.program.*;
public class Location {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the age of employss:");
int age=sc.nextInt();
System.out.println("Enter sex details: M or F");
String sex=sc.nextLine();
System.out.println("Enter the Marital status : (Y or N)");
String marital=sc.nextLine();
sc.close();
if(sex.equals("F"))
{
	System.out.println("Work location: urban area");
}if(sex.equals("M"))
{
	if((20<=age) || (age<=40) )
	{
		System.out.println("work is any where");
	}if (40<age || age<80)
	{
		System.out.println("work location is in urban area");
	}else 
	{
		System.out.println("ERROR");
	}
}
	}

}
