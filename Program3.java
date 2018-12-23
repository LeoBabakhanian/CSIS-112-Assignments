//Create variables firstnum, secondnum, and thirdnum
//Store 105.62 in firstnum
//Store 89.352 in secondnum
//Store 98.67 in thirdnum
//Add all numbers together for total value
//Divide total value by 3 for average value
//Display The total is 293.642
//Display The average is 97.88066666666667
public class Program3
{
   public static void main (String[]args)
   {
      double firstnum;
      double secondnum;
      double thirdnum;
      double total;
      
      firstnum = 105.62;
      secondnum = 89.352;
      thirdnum = 98.67;
      total = firstnum + secondnum + thirdnum;
      
      System.out.print("The total is " + total + "\n");
      System.out.print("The average is " + total / 3 + "\n");
   }
}