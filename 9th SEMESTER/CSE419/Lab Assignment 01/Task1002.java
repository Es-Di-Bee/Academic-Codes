import java.io.IOException;
 import java.util.Scanner;

public class Task1002 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double n = 3.14159;
        double A = n * Math.pow(R,2);
        System.out.printf("A=%.4f", A);
        System.out.println();
 
    }
 
}