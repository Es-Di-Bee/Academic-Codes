import java.util.Scanner;
public class Task02 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                char[] a = str.toCharArray();
                int x = sc.nextInt();
                if (x < a.length) {
                        System.out.println(a[x]);
                } else {
                        System.out.println("Invalid index");
                }
        }
}