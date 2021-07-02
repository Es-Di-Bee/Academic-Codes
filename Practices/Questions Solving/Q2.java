public class Q2
{
    public static void main(String [] args)
    {
        int i =0;
        while(i<5)
        {
            int j =i;
            while(j>1)
                System.out.print(j--);
            System.out.println("****");
            i++;
        }
        double x=7;
        double y=8;
        double z=9;
        System.out.println(x<y || y>z);
        System.out.println(x<y && y>z);
        System.out.println(x<y);
        System.out.println(x+y < z);
        System.out.println(x+y < z);
    }
}

                
          