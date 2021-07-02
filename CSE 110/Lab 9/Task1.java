import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Please enter the elements of the array");
        a[0] = sc.nextInt();
        int max = a[0];
        for(int i=1; i<5; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println("Max number is: " + max);
    }
}
            
        
           