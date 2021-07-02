import java.util.Scanner;
public class Task04 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                char[] a = str.toCharArray();
                String str2 = sc.nextLine();
                char[] b = str2.toCharArray();
                if (a.length < b.length) {
                        System.out.println("false");
                } else {
                        for (int i = b.length-1 ; i >= 0; --i) { 
                                if (b[i] != a[a.length-b.length+i]) {
                                        System.out.println("false");
                                        break;
                                }
                                if (i == 0) System.out.println("true");
                        }
                }
        }
}