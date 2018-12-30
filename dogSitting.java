import java.util.Scanner;
import java.text.DecimalFormat;

public class dogSitting
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat("$#0.00");
      
      String custName;
      
      int numDogs = 0;
      int numDays = 0;
      int choice;
      
      double dailyCost = 0.0;
      double totalCost = 0.0;
      
      System.out.print ("DOG SITTING MENU\n" +
                        "----------------------\n" +
                        "1) Choose to calculate cost\n" +
                        "2) Choose to exit program\n" +
                        "Please make your selection\n");
      choice = keyboard.nextInt();
      
      if ( choice == 1)
      {
         custName = keyboard.nextLine();
         
         System.out.println ("Please enter your name");
         custName = keyboard.nextLine();
         
         System.out.println ("How many dogs will be getting the service?");
         numDogs = keyboard.nextInt();  
             
         System.out.println ("How many days will the service be for?");
         numDays = keyboard.nextInt();
         
         if ( numDogs <= 2)
         {
            dailyCost = 35.00;
         }
         else if ( numDogs > 2)
         {
            dailyCost = (numDogs - 2) * 3.50 + 35.00;
         
            totalCost = dailyCost * numDays;
         
            System.out.print ("Dog Sitting Invoice\n" +
                              "-----------------------\n" +
                              "Number Dogs:  " + numDogs + "\n" +
                              "Number Days:  " + numDays + "\n" +
                              "Daily Cost:   " + formatter.format(dailyCost) + "\n" +
                              "\n" +
                              "Total Cost:   " + formatter.format(totalCost) + "\n");
         }               
      else if ( choice == 2)
      {
         System.out.println ("You have exited the program");
      }
      else if ( choice < 1 || choice > 2)
         System.out.println ("This choice is invalid");
      }
   }
}
      
                        
