import java.util.Scanner;
public class Task7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity numbers you want to input");
        int quantity = sc.nextInt();
        int i = 1;
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        int max = num1;
        int min = num1;
        int sum = num1;
        System.out.println("Please enter the numbers");
        while(i<quantity)
        {
            int num = sc.nextInt();
            if(num>max)
            {
                max = num;
            }
            else if(num<min)
            {
                min = num;
            }
            sum += num;
            i++;
        }
        double avg = ((double)sum) / quantity;
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println("Avg is: " + avg);
    }
}
            
         
    