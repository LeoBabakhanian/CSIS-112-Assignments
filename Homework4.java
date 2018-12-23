//Leo Babakhanian, CS/IS- 112 Summer Class

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework4
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      int numTrees;
      int forDelivery;
      
      double treeHeight;
      double singleTree;
      double treeCost;
      double deliveryCost;
      double totalCost;
      
      treeCost = 0;
      deliveryCost = 0;
      totalCost = 0;
      
      System.out.println("How many trees do you want to purchase?");
      numTrees = keyboard.nextInt();
         
      System.out.println("Enter the height of the trees you want to purchase.");
      treeHeight = keyboard.nextDouble();
      
      System.out.println("Would you like the trees delivered? Enter 1 for Yes, Enter 0 for No.");
      forDelivery = keyboard.nextInt();
      
      if ( treeHeight < 3 )
      {
         treeCost = 39.00;
      }
      else if ( treeHeight >= 3 && treeHeight <= 5 )
      {
         treeCost = 69.50;
      }
      else if ( treeHeight >= 6 && treeHeight <= 8 )
      {
         treeCost = 99.00;
      }
      else if ( treeHeight > 8 )
      {
         treeCost = 199.50;
      }

      if ( forDelivery == 1 )
      {
         if ( numTrees < 5 )
         {
            treeCost = treeCost * 10.00;
            totalCost = treeCost;
         }
         else if ( numTrees >= 5 )
         {
            totalCost = treeCost + 50.00;
         }
      }
      else if ( forDelivery == 0 )
      {
      }
    System.out.println("Green Fields Landscaping");
    System.out.println("Evergreen Tree Invoice");
    System.out.println;
    Systen.out.println( numTrees + " Trees at " + treeCost + " each: $" + totalCost );
    System.out.println("Delivery Charge:     $" 
    System.out.println(totalCost);

  }
}
