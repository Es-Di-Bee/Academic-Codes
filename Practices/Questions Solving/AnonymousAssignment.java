import java.util.Scanner;
public class AnonymousAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the desired grid dimension:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[][] = new int[x][y];
        int sum = x * (x*x + 1) / 2;
        System.out.println("Please enter the desired input:");
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        boolean mainFlag = true;
        boolean flag = false;
        for (int c = 1; c <= 4; ++c) {
            int ans = 0;
            if (c == 1) { // this is for checking the rows
                for (int i = 0; i < a.length; ++i) {
                    ans = 0;
                    for (int j = 0; j < a[i].length; ++j) {
                        ans += a[i][j];
                    }
                    if (ans != sum) {
                        flag = true;
                        break;
                    }
                }
            } else if (c == 2) { // this is for checking the columns
                for (int i = 0; i < a[0].length; ++i) {
                    ans = 0;
                    for (int j = 0; j < a.length; ++j) {
                        ans += a[j][i];
                    }
                    if (ans != sum) {
                        flag = true;
                        break;
                    }
                }
            } else if (c == 3) { // this is for checking the first diagonal
                ans = 0;
                for (int i = 0, j = 0; i < a.length; ++i, ++j) {
                    ans += a[i][j];   
                }
                if (ans != sum) {
                    flag = true;
                }
            } else if (c == 4) {
                ans = 0;
                for (int i = 0, j = a.length-1; i < a.length; ++i, --j) {
                    ans += a[i][j];   
                }
                if (ans != sum) {
                    flag = true;
                }
            }
            
            
            if (flag) {
                mainFlag = false;
                break;
            }
        }
        if (mainFlag) {
            System.out.println("This is a Lo Shu Magic Square.\nAnd, the magic number is " + sum + ".");
        } else {
            System.out.println("This is NOT a Lo Shu Magic Square.");
        }
        System.out.println("\nThank you!!!");
        sc.close(); // closing the scanner
    }
}