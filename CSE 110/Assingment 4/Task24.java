import java.util.Scanner;
public class Task24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = sc.nextInt();
        int count = 1;
        while(count<=number)
        {
            System.out.println(count);
            count++;
        }
    }
}
        
    