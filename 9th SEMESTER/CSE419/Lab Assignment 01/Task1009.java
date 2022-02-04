import java.io.IOException;
 
import java.util.Scanner;
public class Task1009 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        double salary = sc.nextDouble();
        double soldValue = sc.nextDouble();
        double finalSalary = salary + (soldValue * 0.15);
        System.out.printf("TOTAL = R$ %.2f", finalSalary);
        System.out.println();
    }
 
}