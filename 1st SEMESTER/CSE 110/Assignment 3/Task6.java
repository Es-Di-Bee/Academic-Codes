import java.util.Scanner;
public class Task6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        float s = sc.nextFloat();
        float L1 = 3000-125*s*s;
        float L2 = 12000/(4+(s*s/14900));
        if(s<100)
        {
            System.out.println(L1);
        }
        else if(s>=100)
        {
            System.out.println(L2);
        }
    }
}

        