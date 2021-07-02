import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int[] a = new int[3];
        int sum = 0;
        for(int i = 0; i<3; i++)
        {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.print(sum + ",");
        for(int i:a)
        {
            System.out.print(i + ",");
        }
    }
}