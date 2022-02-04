import java.io.IOException;

import java.util.Scanner;
public class Task1020 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int totalDays = sc.nextInt();
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
        System.out.printf("%d ano(s)", years);
        System.out.println();
        System.out.printf("%d mes(es)", months);
        System.out.println();
        System.out.printf("%d dia(s)", days);
        System.out.println();
    }
    
}