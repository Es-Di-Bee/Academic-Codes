import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = summing(sc.nextInt());
        System.out.println(sum);
    }

    public static int summing(int num) {
        if (num == 0) return 0;
        return num + summing(--num);
    }
}
