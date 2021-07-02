public class Task4
{
    public static void main(String[] args)
    {
        int sum = 0;
        int i = 1;
        for(i = 1; i<=600; i++)
        {
            if(i%7==0)
            {
                if(i%9 == 0)
                {
                }
                else
                {
                    sum += i;
                }
            }
            else if(i%9==0)
            {
                sum += i;
            }
        }
        System.out.println(sum); 
    }
}
