/*This is a java program to:
    1. Read in registration number, wage pay rate and number of working hours from the user.
    2. Calculate the total wages paid for the user.
    3. Display the registration number, wage pay rate, number of working hours and the total wages for the user
*/


//this class will enable us to read input frrom the users.
import java.util.Scanner;

class Wages_details
{
    public static void main(String[] args)
    {
        //Declaring the variables that will store the user inputs
        String reg_no; //stores the registration number.
        double wages_rate; //stores the wages payed per hour.
        int hour; //stores the number of hours worked.

        //Declaring calculation variables
        double tt_wages; //total wages paid.
        double Hours;

        //Displaying the header.
        //-----------------------------------------------------------------------------------------------------------------------
        System.out.println("Wage Calculator");
        System.out.println("-------------------------");

        //reading inputs from the user.
        //-------------------------------------------------------------------------------------------------------------
        Scanner reader = new Scanner(System.in); //refence variable reader used to access functions of the class Scanner.

        System.out.print("Enter Your Registration Number: ");
        reg_no = reader.next(); //reading the registration number.

        System.out.print("Enter Your Hourly Pay Rate: ");
        wages_rate = reader.nextDouble(); //read in a double value from the user.

        System.out.print("Enter Hours Worked: ");
        hour = reader.nextInt(); //read in a integer value from the user.
        //---------------------------------------------------------------------------------------------------------------


        //Calculating the total wages paid for the values entered.  
        //--------------------------------------------------------------------------------------------------------------
        tt_wages = (wages_rate * hour); //calculating the total wages paid.
        Hours = (double)(hour);
        
        //-------------------------------------------------------------------------------------------------------------


        //Displaying results to the user.
        //----------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nWage Details:");
        System.out.println("Registration Number:\t\t"+ reg_no);
        System.out.println("Hourly Pay Rate\t\t\t"+ "$"+ wages_rate);
        System.out.println("Hours Worked:\t\t\t"+ Hours);
        System.out.println("Total Wages:\t\t\t"+ "$"+ tt_wages);

        //close the refence variable.
        reader.close();
    }
}
