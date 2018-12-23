//Leo Babakhanian, CS/IS- 112 Summer Class
//Homework #7

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework7
{
   public static void main (String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter1 = new DecimalFormat ("#0");
      DecimalFormat formatter = new DecimalFormat ("##%");

      int numFloors = 0;
      
      double numRooms = 0;
      double occRooms = 0;
      
      double totalRooms = 0;
      double totalOccRooms = 0;
      double percentRooms;
      
      System.out.println ("Please enter the number of floors in the hotel: ");
      numFloors = keyboard.nextInt();
      
      while ( numFloors <=0 )
      {
         System.out.print ("You have entered an invalid number of floors. \n");
         
         System.out.println ("Please enter the number of floors in the hotel: ");
         numFloors = keyboard.nextInt();
      }

      for ( int floorNum = 1; floorNum <= numFloors; ++floorNum )
      {
         if ( floorNum < 13 || floorNum > 13 )
         {
            System.out.println ("Please enter the number of rooms on floor #: " + floorNum);
            numRooms = keyboard.nextInt();
            
            while ( numRooms < 10 )
            {
               System.out.println ("You have entered an invalid number of rooms. ");
               
               System.out.println ("Please enter the number of rooms on floor #: " + floorNum);
               numRooms = keyboard.nextInt();
            }
         
            totalRooms = totalRooms + numRooms;
         
            System.out.println ("Please enter the number of occupied rooms on floor #: " + floorNum );
            occRooms = keyboard.nextInt();
         
            totalOccRooms = totalOccRooms + occRooms;   
         }
      }
      
      percentRooms = totalOccRooms / totalRooms;
      
      System.out.print ("\n");
      System.out.print ("The hotel has a total of " + formatter1.format(totalRooms) + " rooms.\n" +
                        formatter1.format(totalOccRooms) + " of the rooms are occupied.\n" +
                        formatter.format(percentRooms) + " of the rooms are occupied.\n");
      
   }
}