import java.util.Scanner;
public class Task9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<number)
        {
            if(number%i==0)
            {
                sum += i;
            }
            i++;
        }
        if(sum == number)
        {
            System.out.println("The number is a perfect number");
        }
        else
        {
            System.out.println("The number is not a perfect number");
        }
    }
}
                                     