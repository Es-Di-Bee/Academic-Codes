import java.util.Scanner;
public class Task29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int count = 1;
        int sum = 0;
        while (count<number)
        {
            if(number%count==0)
            {
                sum+=count;
            }
            count++;
        }
        if(sum==number)
        {
            System.out.println("The number is a perfect number");
        }
        else
        {
            System.out.println("The number is NOT a perfect number");
        }
    }
}