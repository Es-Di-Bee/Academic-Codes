import java.util.Scanner;
public class Task20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuantity = sc.nextInt();
        int lineCount1 = 1;
        int lineCount2 = 0;
        int spaceQuantity2 = 1;
        int starQuantity = 0;
        while(lineCount1<=lineQuantity)
        {
            if(lineCount1==1|| lineCount1==lineQuantity)
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
            }
            else
            {
                int spaceQuantity1 = lineQuantity - lineCount1;
                for(int spaceCount=1; spaceCount<=spaceQuantity1; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int spaceCount=1; spaceCount<=spaceQuantity2; spaceCount++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                spaceQuantity2 += 2;
            }
            lineCount1++;
            lineCount2++;
            System.out.println();
        }
    }
}