package stringpracticeprograms;

import java.util.Scanner;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter the string");
String message =sc.nextLine();
int [] n=new int[message.length()];
System.out.println(message);
char minChar=message.charAt(0),maxChar=message.charAt(0);
int i,j,min,max;

//convert given string into character array

char[] value1=message.toCharArray();

//count each word in given string and store in array n
for(i=0;i<message.length();i++)
{
	n[i]=1;
	for(j=0;j<message.length();j++)
		{
		if(message[i] == message[j]&& message[i]!='' && message[i]!='0') {
			n[i]++;
			message[j]='0';
		}
		}}
	}
	

}
