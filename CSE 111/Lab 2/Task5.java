import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double E = sc.nextDouble(), R = sc.nextDouble(), L = sc.nextDouble(), 
            C = sc.nextDouble(), f = sc.nextDouble();
        double I =E/ Math.sqrt( Math.pow(R,2) + Math.pow( ( (2*3.1416*f*L)-(1/(2*3.1416*f*C) ) ) ,2) );
        System.out.println(I);
    }
}