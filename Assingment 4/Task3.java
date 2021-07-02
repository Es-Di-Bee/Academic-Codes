import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = sc.nextInt();
        int max = num1;
        int sum = num1;
        int count = 1;
        while(count<=19)
        {
            System.out.println("Please enter a number");
            int number = sc.nextInt();
            if(number>max)
            {
                max = number;
            }
            sum = sum + number;
            count++;
        }
        System.out.println("Maximum number:" + max);
        double avg = sum/20.0;
        System.out.println("Average:" + avg);
    }
}