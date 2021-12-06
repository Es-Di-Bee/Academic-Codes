public class Task17
{
    public static void main(String[] args)
    {
        System.out.println(0);
        System.out.println(1);
        int a = 0;
        int b = 1;
        int sum = 0;
        while(sum <= 1600)
        {
            sum = a + b;
            if (sum > 1600) {
                break;
            }
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
        