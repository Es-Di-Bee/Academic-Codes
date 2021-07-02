import java.util.Scanner;
public class Task16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = sc.nextInt();
        if(number%2==0)
        {
            if(number>=10)
            {
                System.out.println("An even number greater than 10");
            }
            else
            {
                System.out.println("An even number not greater than 10");
            }
        }
        else
        {
            if(number>=10)
            {
                System.out.println("An odd number greater than 10");
            }
            else
            {
                System.out.println("An odd number less than 10");
            }
        }
    }
}
