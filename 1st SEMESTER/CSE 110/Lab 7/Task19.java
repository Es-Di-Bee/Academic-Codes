import java.util.Scanner;
public class Task19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount = 1;
        int lastLineQuantity = lineQuantity;
        int originalLastLineQuantity = lineQuantity;
        int decreasingLastLineQuantity = lineQuantity;
        while(lineCount<=lineQuantity)
        {
            if(lineCount<=2 || lineCount==lineQuantity)
            {
                int spaceQuantity = lineQuantity - lineCount; 
                for(int spaceCount = 1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                for(int columnCount=lastLineQuantity; columnCount<=lineQuantity; columnCount++)
                {
                    System.out.print(columnCount);
                }
            }
            else
            {
                int spaceQuantity1 = lineQuantity - lineCount;
                for(int spaceCount=1; spaceCount<=spaceQuantity1; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print(decreasingLastLineQuantity);
                int spaceQuantity2 = lineCount - 2;
                for(int spaceCount=1; spaceCount<=spaceQuantity2; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print(originalLastLineQuantity);
            }
            lineCount++;
            lastLineQuantity--;
            decreasingLastLineQuantity--;
            System.out.println();
        }
    }
}

