import java.util.Scanner;
public class Task17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount = 1;
        int columnCount = 1;
        int initialColumnCount = columnCount;
        while(lineCount<=lineQuantity)
        {
            if(lineCount<=2 || lineCount==lineQuantity)
            {
                for(columnCount=1; columnCount<=lineCount; columnCount++)
                {
                    System.out.print(columnCount);
                }
                System.out.println();
            }
            else
            {
                System.out.print(initialColumnCount);
                int spaceQuantity = lineCount - 2;
                for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print(columnCount);
                System.out.println();
                columnCount++;
            }
            lineCount++;
        }
    }
}
                
        
    

            
            
            
    
    
