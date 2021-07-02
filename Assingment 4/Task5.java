import java.util.Scanner;
public class Task5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int n = sc.nextInt();
        int count = 1;
        int cubicY = 0;
        while(count<=n)
        {
            cubicY = cubicY + (count*count*count);
            count++;
        }
        System.out.println(cubicY);
    }
}
            