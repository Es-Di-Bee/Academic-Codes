public class Task27
{
    public static void main(String[] args)
    {
        for (int num = 1; num < 1000; ++num) {
            int factors = 0;
            for (int i = 1; i <= num; ++i) {
                if (num % i == 0) {
                    factors++;
                }
            }
            if (factors==2)System.out.println(num);
        }
    }
}