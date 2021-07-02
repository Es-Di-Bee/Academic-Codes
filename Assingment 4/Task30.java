import java.util.Scanner;
public class Task30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = sc.nextInt();
        System.out.println("Please enter a number");
        int num2 = sc.nextInt();
        int primeNumbers = 0;
        int initialFactors = 0;
        int initialCount = 1;
        int factors = 0;
        int number = num1;
        int count = 1;
        int sum = 0;
        int initialSum = 0;
        int perfectNumbers = 0;
        while (number<=num2)
        {
            while(count<=number)
            {
                if(number%count==0)
                {
                    factors++;
                    sum+=count;
                }
                count++;
            }
            if(factors==2)
            {
                primeNumbers++;
            }
            sum = sum-number;
            if(sum==number)
            {
                perfectNumbers++;
            }
            number++;
            count = initialCount;
            factors = initialFactors;
            sum = initialSum;
        }
        System.out.println("Between " + num1 + " and " + num2 + "," + "there are " + primeNumbers + " prime numbers " + " and " + perfectNumbers + " perfect numbers");
    }
}
                
                
            
            
            
            
            
            
            
            
            
            
            
        