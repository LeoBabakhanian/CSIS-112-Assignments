//Leo Babakhanian, CS/IS- 112 Summer Class
//Homework #8, Program #1

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework8
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat ("##.#");
   
      String firstGrade;
      String secondGrade;
      String thirdGrade;
      String fourthGrade;
      String fifthGrade;
      
      String avGrade;
     
      double firstScore;
      double secondScore;
      double thirdScore;
      double fourthScore;
      double fifthScore;
      
      double avGradeScore;
      
      System.out.println ("Please enter the first score between 0 and 100: ");
      firstScore = keyboard.nextDouble();
      
      System.out.println ("Please enter the second score between 0 and 100: ");
      secondScore = keyboard.nextDouble();
      
      System.out.println ("Please enter the third score between 0 and 100: ");
      thirdScore = keyboard.nextDouble();
      
      System.out.println ("Please enter the forth score between 0 and 100: ");
      fourthScore = keyboard.nextDouble();
      
      System.out.println ("Please enter the fifth score between 0 and 100: ");
      fifthScore = keyboard.nextDouble();
      
      calcAverage(firstScore, secondScore, thirdScore, fourthScore, fifthScore);
      
      avGradeScore = calcAverage(firstScore, secondScore, thirdScore, fourthScore, fifthScore);
      
      firstGrade = determineGrade(firstScore);
      System.out.println ("The first letter grade is: " + firstGrade);
      
      secondGrade = determineGrade(secondScore);
      System.out.println ("The second letter grade is: " + secondGrade);
      
      thirdGrade = determineGrade(thirdScore);
      System.out.println ("The third letter grade is: " + thirdGrade);
      
      fourthGrade = determineGrade(fourthScore);
      System.out.println ("The fourth letter grade is: " + fourthGrade);
      
      fifthGrade = determineGrade(fifthScore);
      System.out.println ("The fifth letter grade is: " + fifthGrade);
      
      System.out.println ();
      
      System.out.println ("The average test score is: " + avGradeScore);
      
      avGrade = determineGrade(avGradeScore);
      System.out.println ("The average grade is " + avGrade);
   }
   
   public static double calcAverage (double scoreOne, double scoreTwo, double scoreThree,
                                     double scoreFour, double scoreFive)
   {
      double average;
      average = (scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive) / 5;
      
      return average;
   }
   
   public static String determineGrade (double testScore)
   {
      if (testScore >= 90 && testScore <= 100)
      {
         String A = "A";     
         return A;
      }
      else if (testScore >= 80 && testScore <= 89.9)
      {
         String B = "B";
         return B;
      }
      else if (testScore >= 70 && testScore <= 79.9)
      {
         String C = "C";
         return C;
      }
      else if (testScore >= 60 && testScore <= 69.9)
      {
         String D = "D";
         return D;
      }
      else if (testScore < 60)
      {
         String F = "F";
         return F;
      }
      return null;
      
   }
}   