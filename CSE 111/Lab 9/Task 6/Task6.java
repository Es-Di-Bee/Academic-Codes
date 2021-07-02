import java.util.Vector;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        for (int t = 1; t <= tc; ++t) {
            Vector v = new Vector();
            String main = sc.nextLine();
            String str = main;
            v.add(Long.parseLong(str));
            for (int j=1; j > 0;) {
                Long sum = 0L;
                for (int i = 0; i < str.length(); ++i) {
                    sum += ( ((int)str.charAt(i)-48) * ((int)str.charAt(i)-48) );
                }
                //System.out.println(sum);
                if (sum == 1) {
                    System.out.println("Case #"+t+": "+main+" is a Happy number.");
                    break;
                }
                else if (v.contains(sum)) {
                    System.out.println("Case #"+t+": "+main+" is an Unhappy number.");
                    break;
                } else {
                    v.add(sum);
                    str = Long.toString(sum);
                }
            }
        }
    }
}