import java.util.Scanner;
import java.util.regex.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String regex[] = new String[n];
        for (int i = 0; i < n; ++i) {
            regex[i] = sc.nextLine();
        }
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < x; ++i) {
            String str = sc.nextLine();
            for (int j = 0; j < n; ++j) {
                Pattern p = Pattern.compile(regex[j]);
                Matcher m = p.matcher(str);
                if (m.find()) {
                    System.out.println("YES, " + (j+1));
                    break;
                }
                if (j == n-1) System.out.println("NO, " + 0);
            }
        }

    }
}
