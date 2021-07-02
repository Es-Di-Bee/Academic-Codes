public class perfectNumberCalculator
{
    public static void main(String[] args)
    {
        int number = 1;
        int count = 1;
        int initialCount = 1;
        int initialSum = 0;
        int sum = 0;
        while(number<10000)
        {
            while(count<number)
            {
                if(number%count==0)
                {
                    sum+=count;
                }
                count++;
            }
            if(sum==number)
            {
                System.out.println(number);
            }
            number++;
            count = initialCount;
            sum = initialSum;
        }
    }
}
                
         