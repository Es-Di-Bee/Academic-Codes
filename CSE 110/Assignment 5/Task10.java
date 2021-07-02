import java.util.Scanner;
public class Task10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of given numbers");
        int givenNum = sc.nextInt();
        int[] a = new int[givenNum];
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Please enter a number");
            a[i] = sc.nextInt();
        }
        int i = 0;
        int j = 1;
        while(j<a.length)
        {
            if(a[j]>a[i])
            {
                if((j+1)==a.length)
                {
                    System.out.println("Yes");
                }
            }
            else
            {
                System.out.println("No");
                break;
            }   
            i++;
            j++;
        }
    }
}
    
    
    
    
    
