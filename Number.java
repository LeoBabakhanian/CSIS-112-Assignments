public class Number
{
   public static void main (String[]args)
   {
      //variable = storage location
      //Assignment Operator: variable = expression
      int number; //set aside place in memory
      number = 5; //assign a value to variable
      
      System.out.println("The value of number is " + number);
      
      System.out.print("The value of number is ");
      System.out.println("11");
      
      number = 7;
      //Add a space with println or \n
      //(number) is used to add the value of the integer to the string
      
      System.out.print("The value of number is ");
      System.out.println(number);
      
      //You can break lines by adding a + sign and splitting the string
      
      System.out.print("This is a really long string that " + 
                       "will not fit in one line.\n");
                       
      int numOrangesSold = 20; 
      System.out.print("The number of oranges sold by the vender " +
                       "on Monday was " + numOrangesSold + ".\n");
      
      //LITERALS:
      //5 int literal
      //"5" String literal
      //5.0 double literal
      //5.0f float literal
      //'5' char literal
      
      //Bolean True/False:
                         
      boolean bool;
      bool = true;
      System.out.println (bool);
      bool = false;
      System.out.println (bool);
      
      char letter;
      
      //UNICODE:
      //char 'A' = int 65 | char 'a' = int 97
      //char 'B' = int 66 | char 'b' = int 98
      //char 'C' = int 67 | char 'c' = int 99
      
      letter = 'G';
      System.out.println(letter);
      letter = 65;
      System.out.println(letter);
      letter = 94;
      System.out.println(letter);
      
      //Arithmetic Operators:
      
      int amount;
      int total;
      amount = 5 + 4;
      total = amount * 3;
      amount = amount / 5;
      
      System.out.println(amount);
      System.out.println(total);
      
      //hourlyRate shows initialization of a variable
      double hourlyRate = 25.50;
      //hours is not initialized when it is declared
      double hours;
      double wages;
      
      //value 40.5 is assigned to hours
      hours = 40.5;
      //the product of hourlyRate and hours is calculated 
      //and assigned to wages variable
      wages = hourlyRate * hours;
      
      System.out.println("The calculated wages are $" + wages + ".");
      //The modulus operator returns the remainder of a division 
      //operation involving two integers
      
      //INTEGER DIVISION:
      double result;
      result = 15.0/2.0;
      //15/2 = 7
      //15.0/2.0 = 7.5
      System.out.println("The result of the integer division 15/2"
                         + " is: " + result + ".");
      //Java specific: Java will sometimes convert the literals for you
      //but sometimes it may not
   }
}