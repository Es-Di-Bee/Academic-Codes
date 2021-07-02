import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] a = new int[100];
        for (int i = 0; i < str.length(); ++i) {
            a[(int)str.charAt(i)]++;
        }
        int max = -1;
        char c = '\u0000';
        int index = 0;
        for (int i = 65; i <= 90; ++i) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        a[index] = 0;
        max = -1;
        for (int i = 65; i <= 90; ++i) {
            if (a[i] > max) {
                max = a[i];
                c = (char)i;
            }
        }
        System.out.println(c);
    }
}