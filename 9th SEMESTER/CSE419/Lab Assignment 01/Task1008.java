import java.util.Scanner;
public class Task1008 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int workedHours = sc.nextInt();
        double recievedAmount = sc.nextDouble();
        double salary = workedHours * recievedAmount;
        System.out.printf("NUMBER = %d %n", number);
        System.out.printf("SALARY = U$ %.2f %n", salary);
        System.out.println();
    }
}