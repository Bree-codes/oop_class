//CODE TO COMPARE 2 NUMBERS

import java.util.Scanner;
class Main 
{
public static void main(String[] args)
{

int num1, num2;

Scanner in = new Scanner(System.in);

System.out.print("ENTER THE FIRST NUMBER: ");
num1 = in.nextInt();
System.out.println("NUMBER 1: " + num1);

System.out.print("ENTER THE SECOND NUMBER: ");
num2 = in.nextInt();
System.out.println("NUMBER 2: " + num2);


if(num1 > num2){
System.out.println(num1 +" is greater than "+ num2);
}

else
System.out.println(num2 +" is greater than "+ num1);


}
}
