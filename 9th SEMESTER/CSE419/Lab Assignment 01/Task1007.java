import java.util.Scanner;
public class Task1007 {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int difference = (A * B) - (C * D);
    System.out.printf("DIFERENCA = %d", difference);
    System.out.println();
    }
}