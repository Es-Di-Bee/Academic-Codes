import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        float number1 = sc.nextFloat();
        System.out.println("Please enter 2nd number");
        float number2 = sc.nextFloat();
        float sum = number1 + number2;
        float product = number1 * number2;
        float difference = number1-number2;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(difference);
    }
}
        
                
