import java.util.Scanner;
public class Task11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int count = 1;
        int evenCount = 0;
        while(count<=10)
        {
            System.out.println("Please input a number");
            int number = sc.nextInt();
            if(number%2==0)
            {
                sum+=number;
                evenCount++;
            }
            count++;
        }
        double avg = sum/evenCount;
        System.out.println("Average:" + avg);
        System.out.println("Sum:" + sum);
    }
}
