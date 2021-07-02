import java.util.Scanner;
public class Task5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Please enter 20 numbers");
        while(i<=20)
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
            
        
    