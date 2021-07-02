import java.util.Scanner;
public class Task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of elements of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        double median = 0;
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        if(a.length%2==0)
        {
            int midNum1 = a.length/2;
            int midNum2 = (a.length/2)+1;
            median = ( a[midNum1-1] + a[midNum2-1] ) / 2.0;
        }
        else
        {
            int midNum = ( a.length + 1 ) / 2;
            median = a[midNum-1];
        }
        System.out.println(median);
        sc.close();
    }
}
            
            
        
    
