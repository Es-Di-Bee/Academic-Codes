public class Task7
{
    public static void main(String[] args)
    {
        int[] a = {10, 30, 20, 50, 40};
        for(int i=0; i<=4; i++)
        {
            for(int j=i+1; j<=4; j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After sorting:");
        for (int i:a) 
        {
            System.out.print(i + ",");
        }  
    }
}



