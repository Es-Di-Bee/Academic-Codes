import java.io.IOException;
 
import java.util.Scanner;
public class Task1010 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int product1Code = sc.nextInt();
        int product1Units = sc.nextInt();
        double product1Price = sc.nextDouble();
        int product2Code = sc.nextInt();
        int product2Units = sc.nextInt();
        double product2Price = sc.nextDouble();
        double amount = (product1Units * product1Price) + (product2Units * product2Price);
        System.out.printf("VALOR A PAGAR: R$ %.2f", amount);
        System.out.println();
    }
 
}