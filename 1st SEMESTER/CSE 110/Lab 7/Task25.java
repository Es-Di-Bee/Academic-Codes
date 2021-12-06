import java.util.Scanner;
public class Task25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount1 = 1;
        int lineCount2 = 0;
        int columnQuantity = 0;
        int columnCount = 1;
        int maxColumnCount = 1;
        int presentColumnCount = 1;
        while(lineCount1<=lineQuantity)
        {
            int spaceQuantity = lineQuantity - lineCount1;
            for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
            {
                System.out.print(" ");
            }
            columnQuantity = lineCount1 + lineCount2;
            for(presentColumnCount=1 ; presentColumnCount<=maxColumnCount; presentColumnCount++)
            {
                System.out.print(presentColumnCount);
            }
            for(presentColumnCount -= 2 ; presentColumnCount>=1; presentColumnCount--)
            {
                System.out.print(presentColumnCount);
            }
            lineCount1++;
            lineCount2++;
            maxColumnCount++;
            System.out.println();
        }
    }
}