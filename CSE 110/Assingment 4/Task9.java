public class Task9
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 1;
        while(count<=600)
        {
            if(count%7==0 && count%9!=0)
            {
                sum = sum + count;
            }
            else if(count%9==0)
            {
                sum = sum + count;
            }
            count++;
        }
        System.out.println("Sum is:" + sum);
    }
}

                    