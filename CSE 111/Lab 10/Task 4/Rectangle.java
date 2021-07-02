import java.util.Scanner;
public class Rectangle extends Shape {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        private int length = 0;
        private int width = 0;
        
        public double getLandW() {
                System.out.println("Please enter the length and width of the rectangle");
                length = sc.nextInt();
                width = sc.nextInt();
                return (Paint.amount(area()));
        }
        
        public double area() {
                ans = ( length * width );
                return ans;
        }
        
        public String toString() {
                area();
                return Integer.toString(ans);
        }
}