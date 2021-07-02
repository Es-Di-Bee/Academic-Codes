import java.util.Scanner;
public class ParanthesesMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Boolean hasError = false;
        char[] a = new char[str.length()];
        int index = -1;
        for (int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                 a[++index] = str.charAt(i);
            } else if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                char x = str.charAt(i);
                if (index < 0) {
                    hasError = true;
                    break;
                }
                else if ( (x == ')' && a[index] == '(') || (x == '}' && a[index] == '{') || (x == ']' && a[index] == '[') ) {
                    a[index--] = '\u0000';
                } else {
                    hasError = true;
                    break;
                }
            }
        }
        if (hasError) System.out.println("This expression is NOT correct.");
        else System.out.println("This expression is correct.");
    }
}