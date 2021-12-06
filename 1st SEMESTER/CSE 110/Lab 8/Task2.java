import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ten numbers");
        int[] a = new int[10];
        for(int i = 0; i<10; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Please enter the index number you want to see the value of");
        int index = sc.nextInt();
        System.out.println(a[index]);
    }
}
        