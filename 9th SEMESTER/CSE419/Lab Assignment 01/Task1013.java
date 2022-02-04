import java.io.IOException;

import java.util.Scanner;
public class Task1013 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int greatest = 0;
        if(a > b && a > c)
        {
            greatest = a;
        }
        if(b > a && b > c)
        {
            greatest = b;
        }
        if(c > b && c > a)
        {
            greatest = c;
        }
        System.out.printf("%d eh o maior", greatest);
        System.out.println();
    }
}