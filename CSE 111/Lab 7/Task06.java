import java.util.Scanner;
public class Task06 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                char[] c = str.toCharArray();
                char[] d = str.toCharArray();
                for (int i = 0; i < c.length; ++i) {
                        if (c[i] == a) {
                                c[i] = b;
                        }
                }
                for (int i = 0 ; i < c.length; ++i) {
                        System.out.print(c[i]);
                }
                System.out.println();
        }
}