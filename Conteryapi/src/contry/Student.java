package contry;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your year (2016,2017,2018,2019) :");
String stu_year=sc.nextLine();
System.out.println("Enter the GPA");
double GPA=sc.nextDouble();
System.out.println("Enter the number of cources: ");
int no=sc.nextInt();
String[] cource = new String[no];

for(int counter=0;counter<no;counter++)
{
	System.out.println("Enter the name of cources"+(counter+1));
	cource[counter]= sc.next();
}
sc.close();
System.out.println("your cources are");
for(int counter=0;counter<no;counter++)
{
	System.out.println(cource[counter]);
	
}

	}

}
