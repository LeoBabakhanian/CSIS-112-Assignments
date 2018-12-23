//Leo Babakhanian, CS/IS- 112 Summer Class
//Create inputs for grade1, grade2, grade3, and totalGrade
//Ask for grade1 and store in grade1
//Ask for grade2 and store in grade2
//Ask for grade3 and store in grade3
//Add all Grades together to get totalGrade
//Store total in totalGrade
//Get average of the 3 grades
//Display The average of the scores
import java.util.Scanner;

public class AvGrade
{
   public static void main (String[]args)
   {   
      
      Scanner keyboard = new Scanner( System.in );
      int grade1;     
	   int grade2;
	   int grade3;
      double totalGrade; 

      System.out.print("Please enter the first test score: \n");
      grade1 = keyboard.nextInt(); 		                         
     
      System.out.print("Please enter the second test score: \n");
	   grade2 = keyboard.nextInt(); 

      System.out.print("Please enter the third test score: \n");
	   grade3 = keyboard.nextInt(); 
      
      totalGrade = (grade1 + grade2 + grade3);

      System.out.print("The average of the scores, " + grade1 + ", " + grade2
      + ", and " + grade3 + " is " + totalGrade/3 + "\n");
   }
}