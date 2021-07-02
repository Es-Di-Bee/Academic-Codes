abstract class Shape {
        protected String color = "";
        protected boolean filled = false;
        
        public Shape() {
                
        }
        
        public Shape(String c, boolean f) {
                
        }
        
        public String getColor() {
                return color;
        }
        
        public void setColor(String c) {
                color = c;
        }
        
        public boolean isFilled() {
                return filled;
        }
        
        public void setFfilled(boolean f) {
                filled = f;
        }
        
        public String toString() {
                return color + " " + filled;
        }
        
        abstract double getArea() ;
        abstract double getPerimeter();
}