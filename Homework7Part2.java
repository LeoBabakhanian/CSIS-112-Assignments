//Leo Babakhanian, CS/IS- 112 Summer Class
//Homework 7 Program #2

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework7Part2
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat ("$#,###.00");
      
      double dailyPay = 1;
      double totalPay = 0;
      
      int numDays = 0;
      
      System.out.println ("Please enter the number of days you worked: ");
      numDays = keyboard.nextInt();
      
      while ( numDays < 0)
      {
      
         System.out.println ("You have entered an invalid number of days.");
            
         System.out.println ("Please enter the number of days you worked: ");
         numDays = keyboard.nextInt();
         
      }
      
      for ( int dayNum = 1; dayNum <= numDays; ++dayNum)
      {
        
         dailyPay = dailyPay;
        
         System.out.println ("Pay for day #" + dayNum + ": " + formatter.format(dailyPay));
         
         totalPay = totalPay + dailyPay;
         
         dailyPay = dailyPay * 2;
         
      }
      
      System.out.println ("");
      System.out.println ("TOTAL PAY FOR " + numDays + " DAYS: " + formatter.format(totalPay));
      
   }
}