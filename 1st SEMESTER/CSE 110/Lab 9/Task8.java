import java.util.Scanner;
public class Task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        System.out.println(a[number]);
    }
}