import java.util.Scanner;
public class Task9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount1 = 1;
        int lineCount2 = 0;
        int starQuantity = 0;
        while(lineCount1<=lineQuantity)
        {
            int spaceQuantity = lineQuantity - lineCount1;
            for(int spaceCount=1; spaceCount<=spaceQuantity; spaceCount++)
            {
                System.out.print(" ");
            }
            starQuantity = lineCount1 + lineCount2;
            for(int starCount=1 ; starCount<=starQuantity; starCount++)
            {
                System.out.print("*");
            }
            lineCount1++;
            lineCount2++;
            System.out.println();
        }
    }
}