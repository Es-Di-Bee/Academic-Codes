import java.util.Scanner;
public class Task28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (count<=number)
        {
            if(number%count==0)
            {
                sum+=count;
            }
            count++;
        }
        System.out.println("Sum of factors:" + sum);
    }
}