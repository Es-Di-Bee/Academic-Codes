import java.util.Scanner;
public class Task20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int digit = 0;
        while(number!=0)
        {
            digit = number%10;
            System.out.println(digit);
            number = number/10;
        }
    }
}