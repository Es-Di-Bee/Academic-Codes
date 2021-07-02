public class TestCircle {
        public static void main(String[] args) {
                Circle c = new Circle(5.0);
                System.out.println(c.getArea());
                System.out.println(c.getPerimeter());
                ResizableCircle rc = new ResizableCircle(5.0);
                rc.resize(3);
                System.out.println(rc.getArea());
                System.out.println(rc.getPerimeter());
        }
}