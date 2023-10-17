import java.util.Scanner;

//initializing the class and its attributes
class Book
{
String title;
String author;
int numberofpages;
}


class BookInputTest
{
public static void main(String[] args)
{
//getting inputs from the user

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the title of the book:");
String title = scanner.nextLine();

System.out.println("Enter the name of the author:");
String author = scanner.nextLine();

System.out.println("Enter the number of pages of the book:");
int numberofpages = scanner.nextInt();

//displaying the inputs 
System.out.println("The book title is: " + title);
System.out.println("The author is: " + author);
System.out.println("The book has: " + numberofpages + " pages");

}
}
