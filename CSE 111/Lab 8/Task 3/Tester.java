import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Cicle: ");
        double radius1 = sc.nextDouble();
        Point c1 = new Circle(radius1);
        System.out.println("The area of the circle is " + c1.space() + "\n");
        System.out.print("Enter radius of Sphere: ");
        double radius2 = sc.nextDouble();
        Point s1 = new Sphere(radius2);
        System.out.println("The volume of the sphere is " + s1.space());
    }
}