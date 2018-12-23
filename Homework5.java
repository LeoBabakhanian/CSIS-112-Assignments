//Leo Babakhanian, CS/IS- 112 Summer Class

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework5
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat("#0.0");
      DecimalFormat formatter2 = new DecimalFormat("#0.0000");
      
      int choice = 0;
      
      double radius = 0.0;
      double circumference = 0.0;
      double area = 0.0;
      
      System.out.print ("CIRCLE CALCULATOR MENU\n" +
                        "1) Calculate the Area of a Circle\n" +
                        "2) Calculate the Circumference of a Circle\n" +
                        "3) Quit the Program\n" +
                        "\n" +
                        "Make a selection by choosing a number: \n");              
      choice = keyboard.nextInt();
      
      if (choice == 1)
      {
         System.out.println ("Please enter the radius of the circle: ");
         radius = keyboard.nextDouble();
         
         area = Math.PI * Math.pow(radius, 2);
         
         System.out.println ("The area of the circle with radius " +
                           formatter.format(radius) + " is: " + formatter2.format(area));
      }
      else if (choice == 2)
      {
         System.out.println ("Please enter the radius of the circle: ");
         radius = keyboard.nextDouble();
         
         circumference = 2 * radius * Math.PI;
         
         System.out.println("The circumference of the circle with radius " +
                            formatter.format(radius) + " is: " + formatter2.format(circumference));
      }
      else if (choice == 3)
      {
         System.out.println ("You have chosen to quit the program.");
      }
      else if (choice > 3 || choice < 1)
      {
         System.out.println ("You have made an invalid selection.");
      }
      
   }
}      