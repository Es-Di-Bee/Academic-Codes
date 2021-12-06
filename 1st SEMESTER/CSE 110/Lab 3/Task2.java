import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int number1 = sc.nextInt();
        System.out.println("Please enter 2nd number");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        int product =  number1 * number2;
        int difference = number1-number2;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(difference);
    }
}
        
                
