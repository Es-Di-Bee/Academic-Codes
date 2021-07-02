import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please start typing");
        while(true) {
            String str = sc.next();
            if (str.equals("A")) break;
            System.out.println(str);
        }
    }
}
