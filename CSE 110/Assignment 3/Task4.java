import java.util.Scanner;
public class Task4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        double age = sc.nextDouble();
        System.out.println("Please enter your payment");
        double payment = sc.nextDouble();
        double fivePercentTax = payment*0.05;
        double tenPercentTax = payment*0.10;
        if(age<18)
        {
            System.out.println("No tax");
        }
        else if(payment<10000)
        {
            System.out.println("No tax");
        }
        else if(payment>=10000 && payment<=20000)
        {
            System.out.println(fivePercentTax);
        }
        else if(payment>20000)
        {
            System.out.println(tenPercentTax);
        }
    }
}
            
        