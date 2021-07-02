import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n = sc.nextInt();
        int count = 0, sum = 0;
        if (n != 0) {
            while (n != 0) {
                ++count;
                sum += (n % 10);
                n /= 10;
            }
        } else
            count = 1;
        System.out.println("Number of Digits: " + count);
        System.out.println("Sum of the Digits: " + sum);
    }
}
