import java.util.Scanner;
public class Cylinder extends Shape {
        Scanner sc = new Scanner(System.in);
        double ans = 0.0;
        private double radius = 0.0;
        private double height = 0.0;
        
        public double getRandH() {
                System.out.println("Please enter radius and height of the sphere");
                radius = sc.nextDouble();
                height = sc.nextDouble();
                return (Paint.amount(area()));
        }
        
        public double area() {
                ans = ( height * 3.1416 *  radius * radius );
                return ans;
        }
        
        public String toString() {
                area();
                return Double.toString(ans);
        }
}