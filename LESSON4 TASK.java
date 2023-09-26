import java.util.Scanner;

class Results
{
	public static void main(String[] args)
	{
String Name = "BRENDA MUKAMI", Roll_no = "C026-01-0921/2022", semester = "2.2";
// OPENING SCANNER
Scanner in = new Scanner(System.in);

//ARRAY FOR ENTERING UNIT NAME SCORE AND UNIT CODE
 String[] unitCodes = new String[4];
 String[] unitName = new String[4];
 int[] unitScores = new int[4];

//Variables for internal computations
double total= 0, Average;
char grade = 0;
 // Loop to collect information for each unit
 for (int i = 0; i < 4; i++) {
  System.out.println("Enter the unit code for Unit " + (i + 1) + ": ");
  unitCodes[i] = in.next();

   System.out.println("Enter the name of Unit " + (i + 1) + ": ");
   unitName[i] = in.next();

   System.out.println("Enter the score for Unit " + (i + 1) + ": ");
   unitScores[i] = in.nextInt();
}


//Loop to calcuate the total
for(int j = 0; j<unitScores.length; j++)
{
total+=unitScores[j];
}

//Calcualting the Average
Average = total/4;

//GRADING 
if(Average >= 70 && Average <= 100){
grade = 'A';
}
else if(Average < 70 && Average >= 60){
grade = 'B';
}
else if(Average < 60 && Average >= 50){
grade = 'C';
}
else if(Average < 50 && Average >= 40){
grade = 'E';
}
else if(Average < 40 && Average >= 0){
grade = 'F';
}
else
System.out.println("ERROR!!");




System.out.println("TOTAL: " +(int)total);
System.out.println("AVERAGE: " + Average);

//DISPLAYING
System.out.println("\t\t\t Department of Computer Science");
System.out.println("\t\t\t\t End Semester Results");
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("|Name:-"+ Name + "\t\t |Roll-No:"+ Roll_no + "\t\t Semester"+ semester);
System.out.println("|Unit Code" + "\t\t\t |Unit Name:"+ "\t\t\t\t Score");
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("| " +unitCodes[0] + "\t\t\t | " + unitName[0] + "\t\t\t\t\t | " + unitScores[0]);
System.out.println("| " +unitCodes[1] + "\t\t\t | " + unitName[1] + "\t\t\t\t\t | " + unitScores[1]);
System.out.println("| " +unitCodes[2] + "\t\t\t | " + unitName[2] + "\t\t\t\t\t | " + unitScores[2]);
System.out.println("| " +unitCodes[3] + "\t\t\t | " + unitName[3] + "\t\t\t\t\t | " + unitScores[3]);
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("|Total"+ "\t\t\t\t\t\t\t\t\t |" + total);
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("|Average"+ "\t\t\t\t\t\t\t\t |" + Average);
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("|Grade"+ "\t\t\t\t\t\t\t\t\t |" + grade);
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t\t\t\t |Recommendation |");
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("Grading Criteria \t\t Overall Grade(A-D) \t\t\t Recommend Pass");
System.out.println("70-100 \t\t A");
System.out.println("60-70 \t\t B");
System.out.println("50-60 \t\t C");
System.out.println("40-50 \t\t D");
System.out.println("Below 40\t F");

System.out.println("------------------------------------------------------------------------------------------");

in.close();
		
	}
}
