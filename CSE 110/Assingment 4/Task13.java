import java.util.Scanner;
public class Task13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while(count <= n)
        {
            if(count%2!=0)
            {
                sum += count;
            }
            count++;
        }
        System.out.println("Sum:" + sum);
    }
}