import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n = sc.nextInt();
        int a = 1, b = 2, c = 3;
        int ans = 0, sign = 1;
        for (int i = 0; i < n; ++i, a += 2, b += 4, c += 1) {
            ans += (sign * (a*b*c));
            if (sign == 1) sign = -1;
            else sign = 1;
        }
        System.out.println(ans);
    }
}
