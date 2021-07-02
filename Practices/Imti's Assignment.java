import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integer numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
         System.out.print("Enter two operands: ");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        char a[] = {'*', '/', '%', '+', '-'};
        int found1 = 0, found2 = 0;
        int output1 = 0, output2 = 0;
        for (int i = 0; i < 5; ++i) {
            if (c1 == a[i]) {
                found1 = i;
            }
            if (c2 == a[i]) {
                found2 = i;
            }
        }
        if (found1 <= found2) {
            output1 = func(num1, num2, c1);
            output2 = func(output1, num3, c2);
        } else {
            output1 = func(num2, num3, c2);
            output2 = func(num1, output1, c1);
        }
        System.out.println(num1 + " " + c1 + " " + num2 + " " + c2 + " " + num3 + " " + " = " + output2);
    }
    
    static int func(int a, int b, char c) {
        if (c == '+') {
            return a+b;
        } else if (c == '-') {
            return a-b;
        } else if (c == '*') {
            return a*b;
        } else if (c == '/') {
            return a/b;
        } else {
            return a%b;
        }
    }
}