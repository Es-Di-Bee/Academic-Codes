import java.util.Scanner;
public class Task11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st element of the array");
        int[] a = new int[10];
        a[0] = sc.nextInt();
        System.out.println("Please enter remaining elements");
        for(int i=1; i<10; i++)
        {
            a[i] = sc.nextInt();
            for(int j=0; j<i; j++)
            {
                while(a[i] == a[j])
                {
                    System.out.println("Please enter a different number");
                    a[i] = sc.nextInt();
                    if(a[i] != a[j])
                    {
                        System.out.println("Please enter remaining elements");
                    }
                }
            }
        }
    }
}