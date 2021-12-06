public class Task5
{
    public static void main(String[] args)
    {
        int[] a = {50, 30, 20, 10, 40};
        int count = 1;
        int location = 0;
        int max = a[1];
        while(count<=4)
        {
            if(a[count]>max)
            {
                max = a[count];
                location = count;
            }
            count++;
        }
        int temp = a[1];
        a[1] = max;
        a[location] = temp;
        for(int i:a)
        {
            System.out.print(i + " ");
        }
    }
}
        
        