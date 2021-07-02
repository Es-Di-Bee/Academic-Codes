import java.util.Scanner;
public class Task11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount = 1;
        int lastLineQuantity = lineQuantity;
        while(lineCount<=lineQuantity)
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
            lineCount++;
            lastLineQuantity--;
            System.out.println();
        }
    }
}
                
            