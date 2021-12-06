import java.util.Scanner;
public class Task6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity numbers you want to input");
        int quantity = sc.nextInt();
        int i = 1;
        System.out.println("Please enter the numbers");
        while(i<=quantity)
        {
            int num = sc.nextInt();
            if(num%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
            i++;
        }
    }
}
            
        
    