import java.util.Scanner;
public class finiteBasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        char operator = sc.next().charAt(0);
        float num2 = sc.nextFloat();
        
        switch (operator) {
            case '+':
                float result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
        }
    }
}
