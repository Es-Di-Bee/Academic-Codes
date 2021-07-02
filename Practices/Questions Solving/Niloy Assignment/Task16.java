import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        String n = sc.next();
        for (int i = 0; i < n.length(); ++i) {
            System.out.print(n.charAt(i) + " ");
        }
        System.out.println();
    }
}
