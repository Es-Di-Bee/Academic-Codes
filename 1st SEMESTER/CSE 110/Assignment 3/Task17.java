import java.util.Scanner;
public class Task17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        if(number%2 == 0 || number%5 == 0)
        {
            System.out.println(number);
        }
    }
}