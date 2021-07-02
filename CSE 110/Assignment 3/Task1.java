import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int marks = sc.nextInt();
        if(marks>50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("You shall not pass");
        }
    }
}