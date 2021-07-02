public class Task11
{
    public static void main(String[] args)
    {
        int factors = 0;
        int i = 40;
        int j = 1;
        while(i<=50)
        {
            while(j<=i)
            {
                if(i%j ==0)
                {
                    factors++;
                }
                j++;
            }
            if(factors==2)
            {
                System.out.println(i);
            }
            i++;
            factors = 0;
            j = 1;
        }
    }
}