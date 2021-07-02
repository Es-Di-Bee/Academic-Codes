import java.util.Scanner;
public class Sphere extends Shape {
        Scanner sc = new Scanner(System.in);
        double ans = 0.0;
        private double radius = 0.0;
        public double getRadius() {
                System.out.println("Please enter the radius of the sphere");
                 radius = sc.nextDouble();
                 return (Paint.amount(area()));
        }
        public double area() {
                ans = ( 4 * 3.1416 *  radius * radius);
                return ans;
        }
        
        public String toString() {
                area();
                return Double.toString(ans);
        }
}