import java.util.Scanner;
public class Task16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int num1 = sc.nextInt();
        int max = num1;
        int min = num1;
        int sum = num1;
        int count = 1;
        while(count<=9)
        {
            System.out.println("Please input a number");
            int num = sc.nextInt();
            if(num>max)
            {
                max = num;
            }
            if(num<min)
            {
                min = num;
            }
            sum+=num;
            count++;
        }
        double avg = sum/10.0;
        System.out.println("Max num:" + max);
        System.out.println("Min num:" + min);
        System.out.println("Average:" + avg);
    }
}
        
        