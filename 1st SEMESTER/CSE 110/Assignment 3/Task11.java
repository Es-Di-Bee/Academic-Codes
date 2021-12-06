import java.util.Scanner;
public class Task11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = sc.nextInt();
        System.out.println("Please enter a number");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
            