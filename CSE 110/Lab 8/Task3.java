import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ten numbers");
        int[] a = new int[10];
        int[] b = new int [a.length];
        int reverseCount = a.length - 1;
        for(int i = 0; i<10; i++)
        {
            a[i] = sc.nextInt();
            b[reverseCount] = a[i];
            reverseCount--;
        }
        for(int i:b)
        {
            System.out.print(i);
        }
    }
}