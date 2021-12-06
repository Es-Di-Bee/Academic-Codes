import java.util.Scanner;
public class Task12
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
        int temp = c;
        c = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
            