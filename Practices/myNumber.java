import java.util.Scanner;
public class myNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("kar number chas");
        String name = sc.nextLine();
        String actualName = "shadab";
        System.out.print(name.compareTo(actualName) == 0? "khara dicchi shadab er number, ei ne ==> " : "lol bro, ");
        if(name.compareTo(actualName) == 0)
        {
            int count = 1;
            int integer = 0; 
            System.out.print(integer);
            integer++;
            System.out.print(integer);
            System.out.print(integer*10+52);
            integer += 58;
            System.out.print(integer);
            integer++;
            System.out.print(integer);
            integer -= 20;
            System.out.print(integer);
            System.out.print(integer-32);
        }
        else
        {
            System.out.printf("only %S er number available", actualName);
        }
    }
}
    
    
