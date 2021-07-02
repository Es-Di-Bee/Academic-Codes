import java.util.Scanner;
public class Task9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a quantity");
        int quantity = sc.nextInt();
        int i = 1 ;
        double sum = 0.0;
        int mark;
        int id;
        while(i<=quantity)
        {
            System.out.println("Please enter ID");
            id = sc.nextInt();
            System.out.println("Please enter full name");
            String temp = sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Please enter mark");
            mark = sc.nextInt();
            System.out.println("ID:" + id);
            System.out.print(name + ":");
            System.out.println(mark);
            sum+=mark;
            i++;
        }
        double avg = sum/quantity;
        System.out.println("Average mark of all students:" + avg);
    }
}