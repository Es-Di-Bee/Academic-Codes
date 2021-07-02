import java.util.Scanner;
public class Task2{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type quantity of stars");
        int columnQuantity = sc.nextInt();
        for(int starCount=1; starCount<=columnQuantity; starCount++){
            System.out.print("*");
        }
    }
}