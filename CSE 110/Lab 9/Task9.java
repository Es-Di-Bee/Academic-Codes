import java.util.Scanner;
public class Task9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[15];
        System.out.println("Please enter the elements of the array");
        int zeroCount=0, oneCount=0, twoCount=0, threeCount=0, fourCount=0, fiveCount=0, sixCount=0, sevenCount=0, eightCount=0, nineCount=0;
        for(int i=0; i<15; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] == 0)
            {
              zeroCount++;
            }
            else if(a[i] == 1)
            {
                oneCount++;
            }
            else if(a[i] == 2)
            {
                twoCount++;
            }
            else if(a[i] == 3)
            {
                threeCount++;
            }
            else if(a[i] == 4)
            {
                fourCount++;
            }
            else if(a[i] == 5)
            {
                fiveCount++;
            }
            else if(a[i] == 6)
            {
                sixCount++;
            }
            else if(a[i] == 7)
            {
                sevenCount++;
            }
            else if(a[i] == 8)
            {
                eightCount++;
            }
            else if(a[i] == 9)
            {
                nineCount++;
            }
        }
        System.out.printf("0 has been entered %d times %n", zeroCount);
        System.out.printf("1 has been entered %d times %n", oneCount);
        System.out.printf("2 has been entered %d times %n", twoCount);
        System.out.printf("3 has been entered %d times %n", threeCount);
        System.out.printf("4 has been entered %d times %n", fourCount);
        System.out.printf("5 has been entered %d times %n", fiveCount);
        System.out.printf("6 has been entered %d times %n", sixCount);
        System.out.printf("7 has been entered %d times %n", sevenCount);
        System.out.printf("8 has been entered %d times %n", eightCount);
        System.out.printf("9 has been entered %d times %n", nineCount);
    }
}