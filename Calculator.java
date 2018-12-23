public class Calculator
{
   public static void main (String[]args)
   {
      int amount;
      int m;
      int n;
      int p;
      
      amount = 1;
      m = 50;
      n = 10;
      p = 5;
      
      System.out.println("Answer is " + (n / p + 3) + ".");
      System.out.println("Answer is " + (m / p + n - 10 * amount) + ".");
      System.out.println("Answer is " + (m - 3 * n + 4 * amount) + ".");
      System.out.println("Answer is " + (amount / 5 ) + ".");
      System.out.println("Answer is " + (18 / p) + ".");
      System.out.println("Answer is " + (18 % p) + ".");
      System.out.println("Answer is " + (-p * n) + ".");
      System.out.println("Answer is " + (-m / 20) + ".");
      System.out.println("Answer is " + (-m % 20) + ".");
      System.out.println("Answer is " + ((m + n ) / (p + amount)) + ".");
      System.out.println("Answer is " + (m + n / p + amount) + ".");
   }
}