import java.util.Scanner;
public class Task18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int digits = 0;
        while(number!=0)
        {
            digits++;
            number = number/10;
        }
        System.out.println(digits);
    }
}
