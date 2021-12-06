import java.util.Scanner;
public class Task19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int count = 1;
        int product = 1;
        while(count<=number)
        {
            product = product*10;
            count++;
        }
        System.out.println(product);
    }
}