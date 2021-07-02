import java.util.Scanner;
public class Task4 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                int[] a = new int[255];
                for (int i = 0 ; i < str.length(); ++i) {
                        a[(int)str.charAt(i)]++;
                }
                for (int i = 65; i <= 90; ++i) {
                        System.out.println( (char)i + " which is " + i + " was found " + a[i] + " times");
                }
        }
}