import java.util.Scanner;
public class Task21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount1 = 1;
        int lineCount2 = 0;
        int spaceQuantity2 = 1;
        int columnQuantity = 0;
        int columnCount = 1;
        int initialColumnCount = columnCount;
        int lastColumnCount = columnCount;
        while(lineCount1<=lineQuantity)
        {
            if(lineCount1==1|| lineCount1==lineQuantity)
            {
                int spaceQuantity = lineQuantity - lineCount1;
                for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                columnQuantity = lineCount1 + lineCount2;
                for(columnCount=1 ; columnCount<=columnQuantity; columnCount++)
                {
                    System.out.print(columnCount);
                }
            }
            else
            {
                int spaceQuantity1 = lineQuantity - lineCount1;
                for(int spaceCount=1; spaceCount<=spaceQuantity1; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print(initialColumnCount);
                for(int spaceCount=1; spaceCount<=spaceQuantity2; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print(lastColumnCount);
                spaceQuantity2 += 2;
            }
            lineCount1++;
            lineCount2++;
            lastColumnCount += 2;
            System.out.println();
        }
    }
}