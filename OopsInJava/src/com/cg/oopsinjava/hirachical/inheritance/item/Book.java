package com.cg.oopsinjava.hirachical.inheritance.item;

public class Book extends Item {
String author;
int numberOfPages;
void readContent()
{
	System.out.println("Enter the Book details....");
	System.out.println("Enter the author name");
	author=sc.nextLine();
	System.out.println("Enter the Number Of pages");
	numberOfPages=sc.nextInt();
}
void previewContent() {
	System.out.println("Author Name = "+author);
	System.out.println("Number Of pages = "+numberOfPages);

}
}
