import java.util.Scanner;
public class infiniteBasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double result = num1;
        double num2;
        while (sc.hasNext()) {
            String operator = sc.nextLine();
            if (operator.equals("=")) {
                System.out.println(result);
                break;
            }
            else if (operator.equals("+")) {
                num2 = sc.nextDouble();
                result += num2;
            }
            else if (operator.equals("-")) {
                num2 = sc.nextDouble();
                result -= num2;
            }
            else if (operator.equals("*")) {
                num2 = sc.nextDouble();
                result *= num2;
            }
            else if (operator.equals("/")) {
                num2 = sc.nextDouble();
                result /= num2;
            }
            else if (operator.equals("^")) {
                num2 = sc.nextDouble();
                result = Math.pow(result,num2);
            }
            else if (operator.equals("?")) {
                result = Math.sqrt(result);
            }
            else if (operator.equals("sin")) {
                result = Math.sin(Math.toRadians(result));
            }
            else if (operator.equals("cos")) {
                result = Math.cos(Math.toRadians(result));
            }
            else if (operator.equals("tan")) {
                result = Math.tan(Math.toRadians(result));
            }
            else if (operator.equals("log")) {
                result = Math.log10(result);
            }
            else if (operator.equals("ln")) {
                result = Math.log(result);
            }
        }
    }
}
                
               
            
            
            
        
        
        