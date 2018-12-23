//Leo Babakhanian, CS/IS- 112 Summer Class
//Homework 6

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework6
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat ("$#0.00");
      
      int choice = 0;
      
      double totalSales = 0.0;
      
      do
      {
      System.out.print ("\n" + "BOOK CLUB MEMBERSHIP MENU\n" +
                        "1) Sell a Six Month Membership\n" +
                        "2) Sell a Twelve Month Membership\n" +
                        "3) Quit the Program\n" +
                        "\n" + "Make a selection by choosing a number: \n");
      choice = keyboard.nextInt();
      
      if ( choice == 1 )
      {         
         System.out.println ("You sold a six month membership.");
         
         totalSales = totalSales + 50.50;
      }
      
      else if ( choice == 2 )
      {
         System.out.println ("You sold a 12 month membership.");
         
         totalSales = totalSales + 99.00;
      }
      
      else if ( choice == 3 )
      {
         System.out.println ("The total book club membership sales were " +
                             formatter.format(totalSales));
      }
      
      else if ( choice < 1 || choice > 3)
      {
         System.out.println ("You have made an invalid selection.");
      } 
      }
      while ( choice != 3 );
   }
}      