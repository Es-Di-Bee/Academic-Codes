import java.util.Scanner;
public class Task10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ten numbers");
        int[] a = new int[10];
        int[] storingArray = new int[10];
        int j = 0;
        for(int i=0; i<10; i++)
        {
            a[i] = sc.nextInt();
            while(j<=i)
            {
                storingArray[j] = a[i];
                j++;
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print(storingArray[k]);
                if(k!=i)
                {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

