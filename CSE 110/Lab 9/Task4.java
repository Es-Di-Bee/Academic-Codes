import java.util.Scanner;
public class Task4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Please enter the elements of the array");
        for(int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            for(int j=i+1; j<5; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i:a)
        {
            System.out.print(i + ", ");
        }
    }
}    