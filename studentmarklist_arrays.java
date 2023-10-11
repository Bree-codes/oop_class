import java.util.Scanner;

//marks list program.
class Marklist
{
    static Scanner input;

	static String input(String info)
    {
        String data = "null";

        input=new Scanner(System.in);
        try
        {
            System.out.print(info);
            data = input.nextLine();
        }
        catch(NumberFormatException e)
        {
            System.out.println("An error occurred");
        }
        return data;
    }


	//The main function.
    public static void main(String[] args)
    {

    //initialization of variables
        String names[] = new String[4];
        String roll[] = new String[4];
        int marks_total[][] = new int[4][4];
        double Ave[] = new double[4];
        char results[]= new char[4];
        char grade[] = new char[4];

        //Read the user's roll number, the names, calculate the totals, Averages, Results and the grade.
        for(int i=0;i<4;i++)
        {
        	System.out.println("\n");
            roll[i] = input("Enter Your roll : ");
            names[i] = input("Enter your name : ");
            System.out.println("\n");
            for(int j=0;j<3;j++)
            {
            	//Catch  error if the user input cannot be converted to integer type.
                try
                {
                    marks_total[i][j] =Integer.parseInt(input("Enter your mark"+(j+1)+":"));
                }
                catch(NumberFormatException e)
                {
                    System.out.println("You Enter A Non-Integer Value."); //Print the error message to user.This does not solve the error.
                }
				//sum the user marks.
                marks_total[i][3] += marks_total[i][j];
            }
            System.out.println("The Total is : "+marks_total[i][3]);

            //Average
            Ave[i] = (marks_total[i][3])/3;

            // results
            results[i] = Ave[i] > 50?'P':'F';

			//Grading
            if(Ave[i] >= 70 && Ave[i] <=100)
                grade[i] ='A';
            else if(Ave[i] >= 69)
                grade[i] = 'B';
            else if(Ave[i] >= 0)
                grade[i] = 'C';
            else
                grade[i] = '-';
        }

		//print the page header.
        System.out.println("******************************************************************************");
        System.out.println("\t\t\t\tSTUDENT MARKLIST");
        System.out.println("******************************************************************************");
        System.out.println("Roll\tName\tMark1\tMark2\tMark3\tTotal\tResults\tAverage\tGrade");

		//nested loop to print out the data for each user in table like format.
      	for(int i=0;i<4;i++)
        {
            System.out.println(roll[i]+"\t"+names[i]+"\t"+marks_total[i][0]+"\t"+marks_total[i][1]+"\t"+marks_total[i][2]+"\t"+marks_total[i][3]+"\t"+results[i]+"\t"+Ave[i]+"\t"+grade[i]);
        }
    }
}
