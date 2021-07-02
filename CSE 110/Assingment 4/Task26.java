import java.util.Scanner;
public class Task26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int count = 1;
        int factors = 0;
        while (count<=number)
        {
            if(number%count==0)
            {
                factors++;
            }
            count++;
        }
        if(factors==2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not prime number");
        }
    }
}