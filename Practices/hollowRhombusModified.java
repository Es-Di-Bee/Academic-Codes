import java.util.Scanner;
public class hollowRhombusModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQ = sc.nextInt();
        int spaceQ1 = lineQ - 1, spaceQ2 = 1;
        for (int lineC = 1; lineC <= lineQ; lineC++, spaceQ1--) {
            for (int spaceC = 1; spaceC <= spaceQ1; spaceC++) {
                System.out.print(' ');
            }
            System.out.print('*');
            if (lineC != 1) {
                for (int spaceC = 1; spaceC <= spaceQ2; spaceC++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                spaceQ2 += 2;
            }
            System.out.println();
        }
        lineQ = lineQ - 1;
        spaceQ1 = 1; spaceQ2 -= 4;
        for (int lineC = 1; lineC <= lineQ; lineC++, spaceQ1++) {
            for (int spaceC = 1; spaceC <= spaceQ1; spaceC++) {
                System.out.print(' ');
            }
            System.out.print('*');
            if (lineC != lineQ) {
                for (int spaceC = 1; spaceC <= spaceQ2; spaceC++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                spaceQ2 -= 2;
            }
            System.out.println();
        }
    }
}
