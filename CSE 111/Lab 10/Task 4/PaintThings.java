import java.util.Scanner;
public class PaintThings {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the coverage you want to cover with paint");
                Paint p = new Paint(sc.nextInt());
                System.out.println("Enter 'R' for rectangle, 'S' spehere  and 'C' for cylinder");
                char ch = sc.next().charAt(0);
                if (ch == 'R') {
                        Rectangle r = new Rectangle();
                        System.out.println(r.getLandW());
                } else if (ch == 'S') {
                        Sphere s = new Sphere();
                        System.out.println(s.getRadius());
                } else if (ch == 'C'){
                        Cylinder c = new Cylinder();
                        System.out.println(c.getRandH());
                } else {
                        System.out.println("Please enter a valid character");
                }
        }
}