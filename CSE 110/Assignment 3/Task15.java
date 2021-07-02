import java.util.Scanner;
public class Task15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter hour");
        int hour = sc.nextInt();
        if(hour<0 || hour>24)
        {
            System.out.println("Wrong time");
        }
        else if(hour>=4 && hour<=6)
        {
            System.out.println("Breakfast");
        }
        else if(hour>=12 && hour<=13)
        {
            System.out.println("Lunch");
        }
        else if(hour>=16 && hour<=17)
        {
            System.out.println("Snacks");
        }
        else if(hour>=19 && hour<=20)
        {
            System.out.println("Dinner");
        }
        else
        {
            System.out.println("Patience is a virtue");
        }
    }
}
