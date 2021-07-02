import java.util.Scanner;
public class Task7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount = 1;
        while(lineCount<=lineQuantity)
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
            lineCount++;
            System.out.printf("%n");
        }
    }
}
                
            