import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[11];
        for (int i = 0; i < 11; ++i) {
            int count = 0;
            int x = sc.nextInt();
            for (int j = 0; j < i; ++j) {
                if (a[j] == x) {
                    ++count;
                }
            }
            if (count < 4) {
                a[i] = x;
            } else {
                --i;
                System.out.println("Please enter another number");
            }
        }
    }
}