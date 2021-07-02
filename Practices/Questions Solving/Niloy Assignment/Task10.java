import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n = sc.nextInt();
        int a = 1, b = 3;
        int ans = 0;
        for (int i = 0; i < n; ++i, a += 2, b += 3) {
            ans += (a*b);
        }
        System.out.println(ans);
    }
}
