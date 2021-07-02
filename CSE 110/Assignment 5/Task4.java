public class Task4
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
        int temp = a[0];
        a[0] = max;
        a[location] = temp;
        for(int i:a)
        {
            System.out.print(i + " ");
        }
    }
}
        