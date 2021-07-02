import java.util.Scanner;
public class Task03 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                char[] a = str.toCharArray();
                String str2 = sc.nextLine();
                char[] b = str2.toCharArray();
                if (a.length < b.length) {
                        System.out.println("false");
                } else {
                        for (int i = 0 ; i < b.length; ++i) {
                                if (b[i] != a[i]) {
                                        System.out.println("false");
                                        break;
                                }
                                if (i == b.length-1) System.out.println("true");
                        }
                }
        }
}