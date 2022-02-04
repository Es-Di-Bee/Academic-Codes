import java.io.IOException;

import java.util.Scanner;
public class Task1016 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int minutes = distance * 2;
        System.out.printf("%d minutos", minutes);
        System.out.println();
    }
    
}