import java.util.Scanner;
public class Task4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int evenCount = 0;
        double sum = 0.0;
        System.out.println("Please input a number");
        int num1 = sc.nextInt();
        int min = num1;
        if (num1 %2 == 0) {
            sum += num1;
            evenCount++;
        }
        while(count <= 19)
        {
            System.out.println("Please input a number");
            int number = sc.nextInt();
            if(number < min)
            {
                min = number;
            }
            if(number%2 == 0)
            {
                evenCount++;
                sum = sum + number;
            }
            count++;
        }
        System.out.println("Minumum:" + min);
        double avg = sum/evenCount;
        System.out.println("Average:" + avg);
    }
}

            
        
        