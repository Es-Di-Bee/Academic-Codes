public class Task3
{
    public static void main(String[] args)
    {
        int[] a = {10, 30, 20, 50, 40};
        int location = 0;
        int count = 0;
        int max = a[0];
        while(count<=4)
        {
            if(a[count]>max)
            {
                max = a[count];
                location = count;
            }
            count++;
        }
        System.out.println("Largest number is " + max);
        System.out.println("Largest number was found at location " + location);
    }
}
        