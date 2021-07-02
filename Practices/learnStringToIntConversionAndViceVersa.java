import java.util.Scanner;
public class learnStringToIntConversionAndViceVersa
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        n++; // this line is just for testing if string has actually converted to integer
        System.out.println(n);
        
        int num = 123;
        String str2 = Integer.toString(num);
        // or
        String str3 = Integer.toString(345);
        System.out.println(str2);
        System.out.println(str3);
        
    }
}