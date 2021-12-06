import java.util.Scanner;
public class Task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int number1 = sc.nextInt();
        System.out.println("Please enter 2nd number");
        int number2 = sc.nextInt();
        if(number1>number2)
        {
            int substraction = number1-number2;
            System.out.println(substraction);
        }
        else
        {
            int substraction = number2-number1;
            System.out.println(substraction);
        }
    }
}
