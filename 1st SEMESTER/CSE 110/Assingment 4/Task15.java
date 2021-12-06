import java.util.Scanner;
public class Task15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        while(count<=20)
        {
            System.out.println("Please enter a number");
            int number = sc.nextInt();
            sum+=number;
            System.out.println(sum);
            count++;    
        }
    }
}

