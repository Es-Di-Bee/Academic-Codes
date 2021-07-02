import java.util.Scanner;
public class Task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of published articles");
        int articles = sc.nextInt();
        int totalFees = articles * 500;
        System.out.println(totalFees);
    }
}