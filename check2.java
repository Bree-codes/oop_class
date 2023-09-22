//This is a program to check whether anumber is even or odd
import java.util.Scanner;
class Main
{
public static void main(String[] args) 
{
int number;

Scanner in = new Scanner(System.in);
System.out.print("This is any number you wish:");
number = in.nextInt();

System.out.println("You entered:"+ number);
 

 if(number % 2 == 0){
 System.out.println("This is an even number");
}

else
 System.out.println("This is an odd number");
}
}
