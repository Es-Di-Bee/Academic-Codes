import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter height of the triangle");
        int height = sc.nextInt();
        System.out.println("Please enter width of the triangle");
        int width = sc.nextInt();
        int area = height * width;
        System.out.println(area);
    }
}