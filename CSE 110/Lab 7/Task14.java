import java.util.Scanner;
public class Task14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        System.out.println("Please type quantity of stars");
        int starQuantity = sc.nextInt();
        int lineCount = 1;
        while(lineCount<=lineQuantity) 
        {
            if(lineCount==1 || lineCount==lineQuantity)
            {
                for(int starCount=1; starCount<=starQuantity; starCount++)
                {
                    System.out.print("*");
                }
                System.out.println();
                lineCount++;
            }
            if(lineCount<lineQuantity)
            {
                int spaceQuantity = starQuantity - 2;
                System.out.print("*");
                for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                lineCount++;
            }
        }
    }
}    
    
    
    
