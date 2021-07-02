import java.util.Scanner;
public class Task18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount = 1;
        while(lineCount<=lineQuantity)
        {
            if(lineCount<=2 || lineCount==lineQuantity)
            {
                int spaceQuantity = lineQuantity - lineCount; 
                for(int spaceCount = 1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                int starQuantity = lineQuantity - spaceQuantity;
                for(int starCount=1; starCount<=starQuantity; starCount++)
                {
                    System.out.print("*");
                }
                System.out.printf("%n");
            }
            else
            {
                int spaceQuantity1 = lineQuantity - lineCount;
                for(int spaceCount=1; spaceCount<=spaceQuantity1; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                int spaceQuantity2 = lineCount - 2;
                for(int spaceCount=1; spaceCount<=spaceQuantity2; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            lineCount++;
        }
    }
}   
