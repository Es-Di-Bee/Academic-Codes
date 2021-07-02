import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Please enter the elements of the array");
        a[0] = sc.nextInt();
        int max = a[0];
        int min = a[0];
        int largestNumberLocation = 0;
        int smallestNumberLocation = 0;
        for(int i=1; i<5; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] > max)
            {
                max = a[i];
                largestNumberLocation = i;
            }
            else if(a[i] < min)
            {
                min = a[i];
                smallestNumberLocation = i;
            }
        }
        System.out.printf("Smallest number %d was found at location %d %n", min, smallestNumberLocation);
        System.out.printf("Largest number %d was found at location %d %n", max, largestNumberLocation);
    }
}
            
        
           