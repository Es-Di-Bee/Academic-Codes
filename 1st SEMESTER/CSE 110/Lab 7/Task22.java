import java.util.Scanner;
public class Task22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount = 1;
        int spaceQuantity2 = 1;
        int starQuantity = 0;
        while(lineCount<=lineQuantity)
        {
            if(lineCount==1)
            {
                int spaceQuantity = lineQuantity - lineCount;
                for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else
            {
                int spaceQuantity1 = lineQuantity - lineCount;
                for(int spaceCount=1; spaceCount<=spaceQuantity1; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int spaceCount=1; spaceCount<=spaceQuantity2; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                spaceQuantity2 += 2;
            }
            lineCount++;
            System.out.println();
        }
        lineCount = 1;
        int spaceQuantity1 = 1;
        spaceQuantity2 = spaceQuantity2 - 4;
        while(lineCount<lineQuantity)
        {
            if(lineCount == (lineQuantity-1))
            {
                int spaceQuantity = lineCount;
                for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                break;
            }
            else
            {
                for(int spaceCount=1; spaceCount<=spaceQuantity1; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int spaceCount=1; spaceCount<=spaceQuantity2; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                spaceQuantity1++;
                spaceQuantity2 -= 2;
                lineCount++;
                System.out.println();
            }
        }
    }
}    



