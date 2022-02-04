
 
import java.util.Scanner;
public class Task1036 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double rootSquarePart = Math.sqrt(Math.pow(B,2) - 4*A*C);
        double divisorPart = 2*A;
        if(rootSquarePart >= 0 && divisorPart != 0)
        {
            double root1 = (-B + rootSquarePart) / divisorPart;
            double root2 = (-B - rootSquarePart) / divisorPart;
            System.out.printf("R1 = %.5f", root1);
            System.out.println();
            System.out.printf("R2 = %.5f", root2);
            System.out.println();
        }
        else
        {
           System.out.println("Impossivel calcular"); 
        }
    }
 
}