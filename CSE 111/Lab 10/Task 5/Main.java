public class Main {
        public static void main(String[] args) {
                Circle c = new Circle(5.0, "Red", true);
                Rectangle r = new Rectangle(4.0, 2.0, "Green", false);
                Square s = new Square(6.0, "Blue", true);
                System.out.println(c + "\n" + r + "\n" + s);
        }
}