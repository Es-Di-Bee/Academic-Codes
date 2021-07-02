class LearnEnhancedForLoop 
{
    public static void main(String[] args)
    {
        int[] a = {19,65,45,55,99};
        int c;
        c = 0;
        while(c<a.length) 
        {
            int m = a[c];
            System.out.print(m + " ");
            ++c;
        }
        System.out.println();
        for(int m:a)
        {
            System.out.print(m + " ");
        }
    }
}