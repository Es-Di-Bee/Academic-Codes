import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Please enter the elements of the array");
        a[0] = sc.nextInt();
        int max = a[0];
        int largestNumberLocation = 0;
        for(int i=1; i<5; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] > max)
            {
                max = a[i];
                largestNumberLocation = i;
            }
        }
        System.out.printf("largest number %d was found at location %d", max, largestNumberLocation);
    }
}
            
        
           