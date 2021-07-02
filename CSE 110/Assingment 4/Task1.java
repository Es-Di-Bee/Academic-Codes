import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = sc.nextLine();
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int count = 1;
        while(count<=number)
        {
            System.out.println(name);
            count++;
        }
    }
}