import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        String n = sc.next();
        System.out.println("The most significant digit is: " + n.charAt(0));
    }
}
