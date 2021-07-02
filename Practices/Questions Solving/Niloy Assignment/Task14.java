import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        String n = sc.next();
        String ans = "";
        for (int i = n.length()-1; i >= 0; --i) {
            ans += n.charAt(i);
        }
        if (n.equals(ans)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
