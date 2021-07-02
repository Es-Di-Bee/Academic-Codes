import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int marks = sc.nextInt();
        if(marks>100)
        {
            System.out.println("Wrong input");
        }
        else if(marks>=90)
        {
            System.out.println("A");
        }
        else if(marks>=80)
        {
            System.out.println("B");
        }
        else if(marks>=70)
        {
            System.out.println("C");
        }
        else if(marks>=60)
        {
            System.out.println("D");
        }
        else if(marks>=50)
        {
            System.out.println("E");
        }
        
        else if(marks>=0)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Wrong input");
        }
    }
}
    