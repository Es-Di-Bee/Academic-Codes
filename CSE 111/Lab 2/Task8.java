import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; ++i) {
            int x = sc.nextInt();
            a[x]++;
        }
        for (int i = 0; i < 10; ++i) {
            if (a[i] >= 2 && a[i] < 5) {
                System.out.print(i);
                System.out.print(",");
            }
        }
        System.out.println();
    }
}