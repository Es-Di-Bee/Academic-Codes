import java.util.Scanner;
public class Task13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int evenSum = 0;
        int oddSum = 0;
        int divisibleByFiveSum = 0;
        for(int i=0; i<10; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]%2==0)
            {
                evenSum += a[i];
                
            }
            else
            {
                oddSum += a[i];
            }
            if(a[i]%5==0)
            {
                divisibleByFiveSum += a[i];
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of numbers divisible by five: " + divisibleByFiveSum);
    }
}