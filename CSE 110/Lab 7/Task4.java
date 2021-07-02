import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        System.out.println("Please type quantity of columns");
        int columnQuantity = sc.nextInt();
        for(int lineCount=1; lineCount<=lineQuantity; lineCount++){
            for(int columnCount=1; columnCount<=columnQuantity; columnCount++){
                System.out.print(columnCount);
            }
            System.out.println();
        }
    }
}
        