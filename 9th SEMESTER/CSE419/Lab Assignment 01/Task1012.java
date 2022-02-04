import java.io.IOException;
 
import java.util.Scanner;
public class Task1012 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;
        double triangleArea = 0.50 * A * C;
        double circleArea = pi * Math.pow(C,2);
        double trapeziumArea = ((A + B) / 2) * C;
        double squareArea = Math.pow(B,2);
        double rectangleArea = A * B;
        System.out.printf("TRIANGULO: %.3f %n", triangleArea);
        System.out.printf("CIRCULO: %.3f %n", circleArea);
        System.out.printf("TRAPEZIO: %.3f %n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f %n", squareArea);
        System.out.printf("RETANGULO: %.3f", rectangleArea);
        System.out.println();
    }
 
}