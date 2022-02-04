import java.io.IOException;

import java.util.Scanner;
public class Task1019 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int seconds = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
        System.out.println();
    }
    
}