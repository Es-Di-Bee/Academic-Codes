import java.util.Scanner;
public class Task16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount = 1;
        while(lineCount<=lineQuantity)
        {
            if(lineCount<=2 || lineCount==lineQuantity)
            {
                for(int starCount=1; starCount<=lineCount; starCount++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                System.out.print("*");
                int spaceQuantity = lineCount - 2;
                for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
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
                
        
    

            
            
            
    
    
