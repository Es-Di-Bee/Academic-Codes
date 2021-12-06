import java.util.Scanner;
public class Task25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = sc.nextInt();
        int count = 1;
        int factors = 0;
        while (count<=number)
        {
            if(number%count==0)
            {
                factors++;
            }
            count++;
        }
        System.out.println("Factors:" + factors);
    }
}
                
            
    