import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File location = new File("C:\\Users\\User\\Google Drive\\Codes\\CSE 111\\Lab 10\\Task 12\\b.txt");
        try {
            Scanner sc = new Scanner(location);
            int sum = 0;
            while(sc.hasNextInt()) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}