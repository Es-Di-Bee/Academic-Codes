import java.io.IOException;

import java.util.Scanner;
public class Task1017 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int speed = sc.nextInt();
        int distance = speed * time;
        double litresNeeded = (1/12.0) * distance;
        System.out.printf("%.3f", litresNeeded);
        System.out.println();
    }
    
}