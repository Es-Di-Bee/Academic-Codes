import java.util.Scanner;
public class Task21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int givenNumber = sc.nextInt();
        int number = givenNumber;
        int digit = 0;
        while(number!=0)
        {
            digit++;
            number = number/10;
        }
        digit -= 1;
        int product = 1;
        int count = 1;
        while(count <= digit)
        {
            product = product * 10;
            count++;
        }
        int num = givenNumber;
        while(num!=0)
        {
            digit = num/product;
            System.out.println(digit);
            num = num%product;
            product = product/10;
        }
    }
}

