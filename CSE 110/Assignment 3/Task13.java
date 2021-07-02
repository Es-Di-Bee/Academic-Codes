import java.util.Scanner;
public class Task13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = sc.nextInt();
        System.out.println("Please enter a number");
        int b = sc.nextInt();
        System.out.println("Please enter a number");
        int c = sc.nextInt();
        System.out.println("Please enter a number");
        int d = sc.nextInt();
        int temp = c;
        c = d;
        d = b;
        b = temp;
        temp = a;
        a = d;
        d = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
            