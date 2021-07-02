import java.util.Scanner;
public class Task10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        int factors = 0;
        int i = 1;
        while(i <= num)
        {
            if(num%i ==0)
            {
                factors++;
            }
            i++;
        }
        if(factors==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}