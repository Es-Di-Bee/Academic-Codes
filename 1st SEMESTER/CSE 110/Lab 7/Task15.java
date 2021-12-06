import java.util.Scanner;
public class Task15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        System.out.println("Please type quantity of stars");
        int columnQuantity = sc.nextInt();
        int lineCount = 1;
        int columnCount = 1;
        int initialColumnCount = columnCount;
        while(lineCount<=lineQuantity) 
        {
            if(lineCount==1 || lineCount==lineQuantity)
            {
                for(columnCount=1; columnCount<=columnQuantity; columnCount++)
                {
                    System.out.print(columnCount);
                }
                System.out.println();
                lineCount++;
            }
            if(lineCount<lineQuantity)
            {
                int spaceQuantity = columnQuantity - 2;
                System.out.print(initialColumnCount);
                for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print(columnCount-1);
                System.out.println();
                lineCount++;
            }
        }
    }
}    
    
    
    
