public class arrayMultiplication
{
    public static void main(String[] args)
    {
        int[] a = {2, 4};
        int[] b = {5,
                   8}; // below by below style is chosen for the convention of understanding that this is a column matrix
        int c = a[0] * b[0] + a[1] * b[1]; // normal process of multiplication of matrix
        System.out.println(c);
    }
}