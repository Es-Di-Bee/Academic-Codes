import java.util.Scanner;
public class Task9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ten numbers");
        int[] a = new int[10];
        for(int i=0; i<10; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Please enter another number");
        int number = sc.nextInt();
        for(int i=0; i<10; i++)
        {
            if(a[i]==number)
            {
                System.out.println("yes");
                break;
            }
            if(i==9)
            {
                System.out.println("no");
            }
        }
    }
}
