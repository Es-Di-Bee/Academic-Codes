class Circle extends Shape {
        protected double radius = 0.0;
        
        public Circle() {
        }
        public Circle (double r) {
                radius = r;
        }
        public Circle(double r, String c, boolean f) {
                radius = r;
                color = c;
                filled = f;
        }
        
        public double getRadius() {
                return radius;
        }
        
        public void setRadius(double r) {
                radius = r;
        }
        
        public double getArea() {
                return 3.1416 * radius * radius; 
        }
        
        public double getPerimeter()  {
                return 2 * 3.1416 * radius;
        }
        
        public String toString() {
                return "A circle with " + getArea() + " area " + getPerimeter() + " perimeter" + " is " + filled + " with " + color;
        }
}