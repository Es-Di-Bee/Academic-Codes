import java.util.Scanner;
public class Task14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int numberOfTerms = sc.nextInt();
        int product = 1;
        int count = 1;
        while(count <= numberOfTerms)
        {
            System.out.println("Please give a number");
            int number = sc.nextInt();
            product = product * number;
            count++;
        }
        System.out.println(product);
    }
}
        