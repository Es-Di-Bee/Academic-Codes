import java.io.IOException;
 
import java.util.Scanner;
public class Task1038 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int productCode = sc.nextInt();
        int quantity =  sc.nextInt();
        double price = 0;
        if(productCode == 1)
        {
            price = quantity * 4.00;
            System.out.printf("Total: R$ %.2f", price);
        }
        if(productCode == 2)
        {
            price = quantity * 4.50;
            System.out.printf("Total: R$ %.2f", price);
        }
        if(productCode == 3)
        {
            price = quantity * 5.00;
            System.out.printf("Total: R$ %.2f", price);
        }
        if(productCode == 4)
        {
            price = quantity * 2.00;
            System.out.printf("Total: R$ %.2f", price);
        }
        if(productCode == 5)
        {
            price = quantity * 1.50;
            System.out.printf("Total: R$ %.2f", price);
        }
        System.out.println();
    }
}