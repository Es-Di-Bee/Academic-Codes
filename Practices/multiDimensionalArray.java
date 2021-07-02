public class multiDimensionalArray
{
    public static void main(String[] args)
    {
        int[][][] a = 
        {
            {
                {1, -2, 11}, 
                {2, 3, 4}
            }, 
            { 
                {-4, -5, 6, 9}, 
                {11}, 
                {2, 10}
            } 
        };
        for(int[][] twoArray: a)
        {
            for(int[] oneArray: twoArray)
            {
                for(int elements: oneArray)
                {
                    System.out.print(elements + ",");
                }
            }
        }
        System.out.println();
        System.out.println(a[1][1][0]); // play with this line
        
    }
}
