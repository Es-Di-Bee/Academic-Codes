class Rectangle extends Shape {
        protected double width = 0.0;
        protected double length = 0.0;
        
        public Rectangle() {
                
        }
        public Rectangle(double w, double l) {
                width = w;
                length = l;
        }
        public Rectangle(double w, double l, String c, boolean f) {
                width = w;
                length = l;
                color = c;
                filled = f;
        }
        
        public double getWidth() {
                return width;
        }
        
        public void setWidth(double w) {
                width = w;
        }
        
        public double getLength() {
                return length;
        }
        
        public void setLength(double l) {
                length = l;
        }
        
        public double getArea() {
                return length * width;
        }
        
        public double getPerimeter() {
                return 2 * (length+width);
        }
        
        public String toString() {
                return "A rectangle with area " + getArea() + " and perimeter " + getPerimeter() + " is " + filled + " with " + color;
        }
}