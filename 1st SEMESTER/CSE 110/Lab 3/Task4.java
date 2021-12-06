import java.util.Scanner;
public class Task4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        double radius = sc.nextDouble();
        double pi = Math.PI;
        double area = pi*radius*radius;
        double circumference = 2*pi*radius;
        System.out.println(area);
        System.out.println(circumference);
    }
}

            
        