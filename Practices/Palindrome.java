import java.util.Scanner;
public class Palindrome {
      public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int t = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= t; ++i) {
                  String str = sc.nextLine();
                  String str1 = "";
                  for (int j = str.length()-1; j >= 0; --j) {
                        str1 += str.charAt(j);
                  }
                  if (str1.equals(str)) {
                        System.out.println("Case " + i + ": " + "Yes");
                  } else {
                        System.out.println("Case " + i + ": " + "No");
                  }
            }
      }
}