import java.util.Scanner;
public class Task6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int count = 1;
        int y = 0;
        int sign = 1;
        while(count<=n)
        {
            y = y + (sign*count*count);
            count++;
            sign = - sign;
        }
        System.out.println(y);
    }
}