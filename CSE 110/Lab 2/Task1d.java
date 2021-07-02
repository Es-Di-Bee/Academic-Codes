public class Task1d
{
  public static void main(String[] args)
  {
      int term = 18;
      int sign = 1;
      int product = 1;
      while(term <= 63)
      {
          product = term * sign;
          System.out.println(product);
          term += 9;
          sign = -sign;
      }
  }
}