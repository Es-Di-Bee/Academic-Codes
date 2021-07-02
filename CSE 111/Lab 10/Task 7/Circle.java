public class Circle implements GeometricObject {
        protected double radius = 0.0;
        
        public Circle (double r) {
                radius = r;
        }
        
        public double getPerimeter() {
                return 2 * 3.1416 * radius;
        }
        
        public double getArea() {
                return 3.1416 * radius * radius;
        }
        
        
}