import java.util.Scanner;
public class Task7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st side of a triangle");
        double x = sc.nextDouble();
        System.out.println("Please enter 2nd side of a triangle");
        double y = sc.nextDouble();
        System.out.println("Please enter 3rd side of a triangle");
        double z = sc.nextDouble();
        double s = (x+y+z)/2;
        double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println(area);
    }
}