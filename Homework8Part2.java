//Leo Babakhanian, CS/IS- 112 Summer Class
//Homework #8, Program #2

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework8Part2
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat ("#.#");
      DecimalFormat formatter2 = new DecimalFormat ("#0.0000");
      
      String menuChoice = "";
      
      double kilometers;
      double meters;
      double inches;
      double feet;
      
      double kiloConversion;
      double inchesConversion;
      double feetConversion;
      
      int choice = 0;

      do
      {
         showMenu (menuChoice);
         choice = keyboard.nextInt();
         
         while(choice < 1 || choice > 4)
         {
            System.out.println("Invalid selection.");
            
            showMenu(menuChoice);
            choice = keyboard.nextInt();
         }
         if (choice == 1)
         { 
            System.out.println ("Please enter the number of meters you want to convert: ");
            meters = keyboard.nextDouble();
         
            while (meters < 0)
            {
               System.out.println ("Invalid entry.");
            
               System.out.println ("Please enter a positive number: ");
               meters = keyboard.nextDouble();
            }
         
            kiloConversion = calcKilometers(meters);
         
            System.out.println (meters + " meters is " + formatter2.format(kiloConversion) + " kilometers.");

         }
         else if (choice == 2)
         {
            System.out.println ("Please enter the number of meters you want to convert: ");
            meters = keyboard.nextDouble();
         
            while (meters < 0)
            {
               System.out.println ("Invalid entry.");
            
               System.out.println ("Please enter a positive number: ");
               meters = keyboard.nextDouble();
            }
         
            inchesConversion = calcInches(meters);
         
            System.out.println (meters + " meters is " + formatter2.format(inchesConversion) + " inches.");
         }
         else if (choice == 3)
         {
            System.out.println ("Please enter the number of meters you want to convert: ");
            meters = keyboard.nextDouble();
         
            while (meters < 0)
            {
               System.out.println ("Invalid entry.");
            
               System.out.println ("Please enter a positive number: ");
               meters = keyboard.nextDouble();
            }
         
               feetConversion = calcFeet(meters);
         
               System.out.println (meters + " meters is " + formatter2.format(feetConversion) + " feet.");
         }
      } 
      while (choice != 4);
      
         //System.out.println ("Invalid selection.");
  
         //showMenu(menuChoice);
         //choice = keyboard.nextInt();
      
   }
   public static double calcKilometers (double Meters)
   {
      double kiloMeters;
      kiloMeters = Meters * 0.001;
      
      return kiloMeters;
   }
   
   public static double calcInches (double Meters)
   {
      double Inches;
      Inches = Meters * 39.37;
      
      return Inches;
   }
   
   public static double calcFeet (double Meters)
   {
      double Feet;
      Feet = Meters * 3.281;
      
      return Feet;
   }
   
   public static void showMenu (String menu)
   {
      System.out.print ("\nMETER CONVERSION\n" + " 1) Convert to Kilometers\n 2) Convert to Inches\n"
             + " 3) Convert to Feet\n" + " 4) Quit the Program\n" + "Please make a selection: \n");
   
      return;
   }
   
}   