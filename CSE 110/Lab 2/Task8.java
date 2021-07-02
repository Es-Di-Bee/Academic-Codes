import java.util.Scanner;
public class Task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int i = 1;
        int totalDivisors = 0;
        while(i<=number)
        {
            if(number%i==0)
            {
                totalDivisors++;
            }
            i++;
        }
        System.out.println(totalDivisors);
    }
}